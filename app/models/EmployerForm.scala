package models

import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json


/**
  * Created by srikar on 4/30/16.
  */
case class EmployerForm (fname: String, lname: String, organization: String, visaType: String, initiation: String, emailId: String)


object  EmployerForm  {

  implicit  val employerFormat  =  Json.format[EmployerForm]

   val  employerForm : Form[EmployerForm]   =    Form  (
     mapping  (
       "fname"          ->    text,
       "lname"          ->    text,
       "organization"   ->    text,
       "visaType"       ->    text,
       "initiation"     ->    text,
       "emailId"     ->    text
     )(EmployerForm.apply)(EmployerForm.unapply)
   )




}
