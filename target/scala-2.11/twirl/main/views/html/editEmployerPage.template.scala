
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editEmployerPage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editEmployerPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.EmployerForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(emplr: Form[models.EmployerForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.65*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Modify Existing Thing")/*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""

        """),_display_(/*6.10*/form(routes.EmployerController.updateInfoEmployer())/*6.62*/ {_display_(Seq[Any](format.raw/*6.64*/("""
            """),_display_(/*7.14*/inputText(emplr("fname"))),format.raw/*7.39*/("""
            """),_display_(/*8.14*/inputText(emplr("lname"))),format.raw/*8.39*/("""
            """),_display_(/*9.14*/inputText(emplr("organization"))),format.raw/*9.46*/("""
            """),_display_(/*10.14*/inputText(emplr("visaType"))),format.raw/*10.42*/("""
            """),_display_(/*11.14*/inputText(emplr("initiation"))),format.raw/*11.44*/("""
            """),_display_(/*12.14*/inputText(emplr("emailId"))),format.raw/*12.41*/("""

            """),format.raw/*14.13*/("""<div class="buttons">
                <input type="submit" value="Save"/>
            </div>
        """)))}),format.raw/*17.10*/("""
""")))}),format.raw/*18.2*/("""





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
object editEmployerPage extends editEmployerPage_Scope0.editEmployerPage
              /*
                  -- GENERATED --
                  DATE: Sun May 01 20:25:44 EDT 2016
                  SOURCE: /home/srikar/scala-projects/ImmigrationApplication/app/views/editEmployerPage.scala.html
                  HASH: 076f33ddb6582f032bbd942892183223a8a0e4dc
                  MATRIX: 577->1|750->64|777->82|804->84|841->113|880->115|917->126|977->178|1016->180|1056->194|1101->219|1141->233|1186->258|1226->272|1278->304|1319->318|1368->346|1409->360|1460->390|1501->404|1549->431|1591->445|1724->547|1756->549
                  LINES: 20->1|25->1|26->3|27->4|27->4|27->4|29->6|29->6|29->6|30->7|30->7|31->8|31->8|32->9|32->9|33->10|33->10|34->11|34->11|35->12|35->12|37->14|40->17|41->18
                  -- GENERATED --
              */
          