
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registrationPage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class registrationPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.RegistrationForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reg: Form[models.RegistrationForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.67*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
        """),_display_(/*6.10*/form(routes.LoginController.saveRegForm())/*6.52*/ {_display_(Seq[Any](format.raw/*6.54*/("""
                """),_display_(/*7.18*/inputText(reg("firstName"))),format.raw/*7.45*/("""
                """),_display_(/*8.18*/inputText(reg("lastName"))),format.raw/*8.44*/("""
                """),_display_(/*9.18*/inputText(reg("userId"))),format.raw/*9.42*/("""
                """),_display_(/*10.18*/inputText(reg("password"))),format.raw/*10.44*/("""
                """),_display_(/*11.18*/inputText(reg("emailId"))),format.raw/*11.43*/("""
                """),_display_(/*12.18*/inputText(reg("organisation"))),format.raw/*12.48*/("""
                """),_display_(/*13.18*/inputText(reg("userType"))),format.raw/*13.44*/("""


                """),format.raw/*16.17*/("""<div class="buttons">
                    <input type="submit" value="Register"/>
                </div>
        """)))}),format.raw/*19.10*/("""

""")))}),format.raw/*21.2*/("""

"""))
      }
    }
  }

  def render(reg:Form[models.RegistrationForm],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(reg)(messages)

  def f:((Form[models.RegistrationForm]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (reg) => (messages) => apply(reg)(messages)

  def ref: this.type = this

}


}

/**/
object registrationPage extends registrationPage_Scope0.registrationPage
              /*
                  -- GENERATED --
                  DATE: Sun May 01 17:23:10 EDT 2016
                  SOURCE: /home/srikar/scala-projects/ImmigrationApplication/app/views/registrationPage.scala.html
                  HASH: 515d7d32d5b1e6f81c61188b01641705b6dc1958
                  MATRIX: 581->1|756->66|784->85|811->87|842->110|881->112|917->122|967->164|1006->166|1050->184|1097->211|1141->229|1187->255|1231->273|1275->297|1320->315|1367->341|1412->359|1458->384|1503->402|1554->432|1599->450|1646->476|1693->495|1838->609|1871->612
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|30->7|30->7|31->8|31->8|32->9|32->9|33->10|33->10|34->11|34->11|35->12|35->12|36->13|36->13|39->16|42->19|44->21
                  -- GENERATED --
              */
          