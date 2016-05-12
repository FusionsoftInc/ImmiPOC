package daos

import javax.inject.Inject

import models.{EmployerForm}
import play.api.db.slick.DatabaseConfigProvider
import slick.driver.JdbcProfile

import scala.concurrent.ExecutionContext

/**
  * Created by srikar on 4/30/16.
  */
class EmployerRepository    @Inject()  (dbConfigProvider: DatabaseConfigProvider) (implicit ec: ExecutionContext)    {

      protected  val dbConfig  =  dbConfigProvider.get[JdbcProfile]

      import  dbConfig._
      import  driver.api._

  protected  class  EmployerTable(tag: Tag)  extends   Table[EmployerForm](tag, "employer") {

    def  fname            =   column[String]("fname")

    def  lname            =   column[String]("lname")

    def  organization     =   column[String]("organization")

    def  visaType         =   column[String]("visaType")

    def  initiation       =   column[String]("initiation")

    def  emailId       =   column[String]("emailId"  , O.PrimaryKey)

    def * =  (fname, lname, organization, visaType, initiation, emailId)   <>    ((EmployerForm.apply _).tupled,(EmployerForm.unapply))

  }

  protected  val  addedEmplInfo  =   TableQuery[EmployerTable]


  def  addEmployeeData  (
                        fname: String,
                        lname: String,
                        organization: String,
                        visaType: String,
                        initiation: String,
                        emailId : String
                        )   =
       db.run {
         (
           addedEmplInfo.map(emplr =>  (emplr.fname, emplr.lname, emplr.organization, emplr.visaType, emplr.initiation, emplr.emailId))
           )  +=  (fname, lname, organization, visaType, initiation, emailId)
  }

  def  getAddedEmplData  =   db.run {
       addedEmplInfo.result
  }

  def getUpdateData(emid: String)  =     db.run {
    addedEmplInfo.filter(reg =>  reg.emailId === emid).result.head
  }

  def  updateEmplrInfo (
                         fnm: String,
                         lnm: String,
                         org: String,
                         vType: String,
                         init: String,
                         emId : String
                      )     =
    db.run{
      addedEmplInfo.filter(_.emailId   ===  emId )
                   .map(emplr  =>  (emplr.fname, emplr.lname, emplr.organization, emplr.visaType, emplr.initiation, emplr.emailId))
                   .update((fnm, lnm, org, vType, init, emId))
    }

  def  deleteData(emid: String)  =     db.run {
    addedEmplInfo.filter(reg =>  reg.emailId === emid).delete
  }



}
