package controllers

import javax.inject._
import daos.{EmployerRepository, RegistrationRepository}
import models.EmployerForm
import play.api._
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.{Future, ExecutionContext}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class EmployerController @Inject() (val messagesApi: MessagesApi)
                                   (emplrRepo: EmployerRepository)
                                   (implicit ec: ExecutionContext)    extends Controller    with I18nSupport   {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def getInfoEmployer  =   Action.async    {  implicit  request =>
    emplrRepo.getAddedEmplData.map(
      empdata  =>
        Ok(views.html.employerViewPage(empdata.toList))
    )
  }


  def  saveInfoEmployer  =   Action.async  { implicit  request  =>
        EmployerForm.employerForm.bindFromRequest.fold(

              errors  =>   {
                Logger.error("there is error in the request" + errors)
                Future.successful(Ok("Hello World"))
              },
              emplr => {
                    Logger.debug("there is error in the request" )
                    emplrRepo.addEmployeeData(emplr.fname, emplr.lname, emplr.organization, emplr.visaType, emplr.initiation, emplr.emailId)
                      .map { _ =>
                        Redirect(routes.EmployerController.getInfoEmployer())
                      }
              }
        )
  }

  def  updateEmplrData(emId: String)  =   Action.async  {  implicit  request  =>

    emplrRepo.getUpdateData(emId).map(
      upddata   =>
        Ok(views.html.editEmployerPage(EmployerForm.employerForm.fill(upddata)))
    )
  }

  def showUpdEmplrData  =   Action.async    {  implicit  request =>
    emplrRepo.getAddedEmplData.map(
      empdata  =>
        Ok(views.html.employerViewPage(empdata.toList))
    )
  }

  def updateInfoEmployer  =   Action.async  { implicit  request  =>
        EmployerForm.employerForm.bindFromRequest.fold(

              errors  =>   {
                Logger.error("there is error in the request" + errors)
                Future.successful(Ok("Hello World"))
              },
              emplr => {
                Logger.debug("there is error in the request" )
                emplrRepo.updateEmplrInfo(emplr.fname, emplr.lname, emplr.organization, emplr.visaType, emplr.initiation, emplr.emailId)
                  .map { _ =>
                    Redirect(routes.EmployerController.getInfoEmployer())
                  }
              }
        )

  }


  def  deleteEmplrData(emId: String)  =   Action.async    {  implicit  request =>
    emplrRepo.deleteData(emId).map(_  =>
        Redirect(routes.EmployerController.getInfoEmployer())
    )
  }



  def  addEmplrData    =    Action  {
    Ok(views.html.employerAddPage(EmployerForm.employerForm))
  }









}
