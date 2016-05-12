package models

import play.api.data.Form
import play.api.data.Forms._


/**
  * Created by srikar on 4/29/16.
  */
case class LoginPassword (emailId: String, password: String, retypePassword: String)


object  LoginPassword  {
   val loginPasswordForm: Form[LoginPassword]   =     Form (
     mapping (
       "emailId"    ->  text,
       "password"   ->  text,
       "retypePassword"   ->  text
     )(LoginPassword.apply) (LoginPassword.unapply)
   )
}
