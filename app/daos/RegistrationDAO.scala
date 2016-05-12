package daos

import com.google.inject.ImplementedBy
import models.RegistrationForm

import scala.concurrent.Future

/**
  * Created by srikar on 5/11/16.
  */

@ImplementedBy(classOf[RegistrationDAOImpl])
trait RegistrationDAO {

  def insertRegistrationData(newUser:RegistrationForm) : Future[String]
  def getRegData : Future[Seq[RegistrationForm]]
  def getPassword(emid: String) : Future[(String, String)]


}
