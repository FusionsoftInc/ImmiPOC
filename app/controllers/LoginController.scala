package controllers

//import javax.inject._
import com.google.inject.Inject
import models._
import play.api._
import play.api.http.Writeable
import play.api.i18n.{Messages, I18nSupport, MessagesApi}
import play.api.libs.json.Json
import play.api.libs.json.Json
import play.api.mvc._
import daos.RegistrationDAO

import scala.concurrent.{ExecutionContext, Future}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

class LoginController @Inject() (val messagesApi: MessagesApi)
                                (regRepo: RegistrationDAO)
                                (implicit ec: ExecutionContext)            extends Controller  with I18nSupport  {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */


  def loginPage = Action {
    Ok(views.html.loginPage(Login.loginForm))
  }

  implicit  val registrationFormat  =  Json.format[RegistrationForm]

  def  validateLogin   =   Action.async  {  implicit  request  =>
        Login.loginForm.bindFromRequest.fold(

              errors  =>   {
                Logger.error("there is error in the request" + errors)
                Future.successful(Ok("Hello World"))
              },
              login => {
                     regRepo.getPassword(login.emailId).map { case (pw, ut) =>
                           if ((pw == login.password) && (ut == "Employee"))
                             Redirect(routes.EmployeeController.getEmployeeInfo)
                           else if ((pw == login.password) && (ut == "Employer"))
                             Redirect(routes.EmployerController.getInfoEmployer)
                           else
                             Redirect(routes.EmployerController.getInfoEmployer)
                     }
              }

        )
  }


  def  regPage   =  Action  {
    Ok(views.html.registrationPage(RegistrationForm.registrationForm))
  }

  def  saveRegForm   =   Action.async  {  implicit  request  =>

      RegistrationForm.registrationForm.bindFromRequest.fold(

        errorform  =>  {
          Logger.error("there is error in the request" + errorform)
          Future.successful(Ok("Hello World"))
        },
        regis =>  {
          val  regUser  =  RegistrationForm(regis.firstName, regis.lastName, regis.userId, regis.password, regis.emailId, regis.organisation, regis.userType)
          regRepo.insertRegistrationData(regUser).map( reg   =>
            Redirect(routes.LoginController.loginPage())
          )
        }
      )
  }

  def  getRegistrationData  =   Action.async  {
    regRepo.getRegData.map(reg  =>  Ok(Json.toJson(reg)))
  }



  def  forgotPassword   =  Action  {
    Ok(views.html.passwordPage(LoginPassword.loginPasswordForm))
  }

  def  savePassword   =   TODO
  //
  // Action.async  {  implicit  request  =>

//        LoginPassword.loginPasswordForm.bindFromRequest.fold(

//            errorform  =>  {
//              Logger.error("there is error in the request" + errorform)
//              Future.successful(Ok("There are errors in the form"))
//            },
//            pass =>  {
//                      if (pass.password  ==  pass.retypePassword)   {
//                          regRepo.updatePassword(pass.emailId,pass.password).map( _   =>
//                            Redirect(routes.LoginController.thankYouPage())
//                          )
//                      }
//                      else
//                        Future.successful(Ok("Pass words are not same, please type correctly."))
//            }
//        )
//  }

  def  thankYouPage   =   Action  {
    Ok("Your password is changed successfully!!.")
  }











}
