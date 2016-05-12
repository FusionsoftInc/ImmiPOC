package models

import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json

/**
  * Created by srikar on 4/28/16.
  */
case class Registration (rowNo: Int, firstName: String, lastName: String, userId: String, password: String, emailId: String, organisation: String, userType: String)

case class RegistrationForm (firstName: String, lastName: String, userId: String, password: String, emailId: String, organisation: String, userType: String)


object  RegistrationForm  {

  implicit  val registrationFormat  =  Json.format[RegistrationForm]


  val registrationForm: Form[RegistrationForm]   =    Form (
    mapping (
      "firstName"     ->    text,
      "lastName"      ->    text,
      "userId"        ->    text,
      "password"      ->    text,
      "emailId"       ->    text,
      "organisation"  ->    text,
      "userType"      ->    text
    ) (RegistrationForm.apply)(RegistrationForm.unapply)
  )



}



