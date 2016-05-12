
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object employerAddPage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class employerAddPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.EmployerForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(emplr: Form[models.EmployerForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
        """),_display_(/*6.10*/form(routes.EmployerController.saveInfoEmployer())/*6.60*/ {_display_(Seq[Any](format.raw/*6.62*/("""
                """),_display_(/*7.18*/inputText(emplr("fname"))),format.raw/*7.43*/("""
                """),_display_(/*8.18*/inputText(emplr("lname"))),format.raw/*8.43*/("""
                """),_display_(/*9.18*/inputText(emplr("organization"))),format.raw/*9.50*/("""
                """),_display_(/*10.18*/inputText(emplr("visaType"))),format.raw/*10.46*/("""
                """),_display_(/*11.18*/inputText(emplr("initiation"))),format.raw/*11.48*/("""
                """),_display_(/*12.18*/inputText(emplr("emailId"))),format.raw/*12.45*/("""

                """),format.raw/*14.17*/("""<div class="buttons">
                    <input type="submit" value="Add"/>
                </div>
        """)))}),format.raw/*17.10*/("""

""")))}),format.raw/*19.2*/("""

"""))
      }
    }
  }

  def render(emplr:Form[models.EmployerForm],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(emplr)(messages)

  def f:((Form[models.EmployerForm]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (emplr) => (messages) => apply(emplr)(messages)

  def ref: this.type = this

}


}

/**/
object employerAddPage extends employerAddPage_Scope0.employerAddPage
              /*
                  -- GENERATED --
                  DATE: Sun May 01 18:02:34 EDT 2016
                  SOURCE: /home/srikar/scala-projects/ImmigrationApplication/app/views/employerAddPage.scala.html
                  HASH: b402a51d1adc7edfefcd2786d0d87495c5849c41
                  MATRIX: 575->1|748->64|776->83|803->85|834->108|873->110|909->120|967->170|1006->172|1050->190|1095->215|1139->233|1184->258|1228->276|1280->308|1325->326|1374->354|1419->372|1470->402|1515->420|1563->447|1609->465|1749->574|1782->577
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|30->7|30->7|31->8|31->8|32->9|32->9|33->10|33->10|34->11|34->11|35->12|35->12|37->14|40->17|42->19
                  -- GENERATED --
              */
          