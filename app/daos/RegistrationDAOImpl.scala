package daos

import javax.inject.Inject

import models.{RegistrationForm, Registration}
import play.api.Logger
import play.api.db.slick.DatabaseConfigProvider
import slick.driver.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by srikar on 4/29/16.
  */
class RegistrationDAOImpl  @Inject()  (dbConfigProvider: DatabaseConfigProvider) (implicit ec: ExecutionContext)  extends  RegistrationDAO {

  protected  val dbConfig =  dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import driver.api._

  protected  class  RegistrationTable(tag: Tag)  extends   Table[RegistrationForm](tag, "registration") {

    def  firstName  =  column[String]("firstName")

    def  lastName   =  column[String]("lastName")

    def  userId     =   column[String]("userId")

    def  password   =   column[String]("password")

    def  emailId    =   column[String]("emailId" , O.PrimaryKey)

    def  organisation   =   column[String]("organisation")

    def  userType     =     column[String]("userType")

    def * =  (firstName, lastName, userId, password, emailId, organisation, userType)   <>    ((RegistrationForm.apply _).tupled,(RegistrationForm.unapply))

  }

  protected  val  registrationInfo    =   TableQuery[RegistrationTable]

  // insert data in the database
   override def insertRegistrationData(newUser: RegistrationForm): Future[String]      =    db.run (registrationInfo   +=  newUser)
                                                                      .map(res =>  "User Data Inserted Successfully")
                                                                          .recover{
                                                                            case ex: Exception =>  Logger.error("there is error in insert" + ex.getCause.getMessage)
                                                                                                   ""
                                                                          }

  // get the data from the database.
    override def getRegData: Future[Seq[RegistrationForm]]   =     db.run(registrationInfo.result)

  // get password from the database.
    override def getPassword(emid: String)  =     db.run {
      registrationInfo.filter(reg =>  reg.emailId === emid).map(rg =>  (rg.password,rg.userType)).result.head
    }

  // update the password in the database.
//    def  updatePassword (
//                          emId: String,
//                          pw: String
//                        )     =
//          db.run{
//                registrationInfo.filter(_.emailId   ===  emId ).map(pword  =>  (pword.password)).update(pw)
//          }




}



