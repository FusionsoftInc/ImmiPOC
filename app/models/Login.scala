package models

import play.api.data.Form
import play.api.data.Forms._

/**
  * Created by srikar on 4/29/16.
  */
case class Login(emailId: String, password: String)

object Login  {

  val  loginForm: Form [Login]  =   Form  (
    mapping(

      "emailId"   ->    text,
      "password"  ->    text
    )(Login.apply)(Login.unapply)
  )

}
