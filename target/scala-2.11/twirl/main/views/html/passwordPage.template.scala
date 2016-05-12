
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object passwordPage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class passwordPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.LoginPassword],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pw: Form[models.LoginPassword])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.63*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
        """),_display_(/*6.10*/form(routes.LoginController.savePassword())/*6.53*/ {_display_(Seq[Any](format.raw/*6.55*/("""
                """),_display_(/*7.18*/inputText(pw("emailId"))),format.raw/*7.42*/("""
                """),_display_(/*8.18*/inputText(pw("password"))),format.raw/*8.43*/("""
                """),_display_(/*9.18*/inputText(pw("retypePassword"))),format.raw/*9.49*/("""

                """),format.raw/*11.17*/("""<div class="buttons">
                    <input type="submit" value="change password"/>
                </div>
        """)))}),format.raw/*14.10*/("""

""")))}),format.raw/*16.2*/("""

"""))
      }
    }
  }

  def render(pw:Form[models.LoginPassword],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(pw)(messages)

  def f:((Form[models.LoginPassword]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (pw) => (messages) => apply(pw)(messages)

  def ref: this.type = this

}


}

/**/
object passwordPage extends passwordPage_Scope0.passwordPage
              /*
                  -- GENERATED --
                  DATE: Sun May 01 17:23:10 EDT 2016
                  SOURCE: /home/srikar/scala-projects/ImmigrationApplication/app/views/passwordPage.scala.html
                  HASH: f1b8b5d9909d60e5d50517772795355f93b507a9
                  MATRIX: 570->1|741->62|769->81|796->83|827->106|866->108|902->118|953->161|992->163|1036->181|1080->205|1124->223|1169->248|1213->266|1264->297|1310->315|1462->436|1495->439
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|30->7|30->7|31->8|31->8|32->9|32->9|34->11|37->14|39->16
                  -- GENERATED --
              */
          