
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loginPage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class loginPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Login],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(lg: Form[models.Login])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Welcome to Play")/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""
        """),_display_(/*7.10*/form(routes.LoginController.validateLogin())/*7.54*/ {_display_(Seq[Any](format.raw/*7.56*/("""
                """),_display_(/*8.18*/inputText(lg("emailId"))),format.raw/*8.42*/("""
                """),_display_(/*9.18*/inputText(lg("password"))),format.raw/*9.43*/("""

                """),format.raw/*11.17*/("""<div class="buttons">
                    <input type="submit" value="Login"/>
                    <a href=""""),_display_(/*13.31*/routes/*13.37*/.LoginController.regPage()),format.raw/*13.63*/("""" >Register</a>
                    <a href=""""),_display_(/*14.31*/routes/*14.37*/.LoginController.forgotPassword()),format.raw/*14.70*/("""" >forgot password</a>
                </div>
        """)))}),format.raw/*16.10*/("""

""")))}),format.raw/*18.2*/("""

"""))
      }
    }
  }

  def render(lg:Form[models.Login],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(lg)(messages)

  def f:((Form[models.Login]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (lg) => (messages) => apply(lg)(messages)

  def ref: this.type = this

}


}

/**/
object loginPage extends loginPage_Scope0.loginPage
              /*
                  -- GENERATED --
                  DATE: Wed May 11 19:21:41 EDT 2016
                  SOURCE: /home/srikar/scala-projects/ImmigrationApplication/app/views/loginPage.scala.html
                  HASH: 043009f59e8b2de9de5c670256e450d8f0639d2d
                  MATRIX: 556->1|719->54|747->73|775->76|806->99|845->101|881->111|933->155|972->157|1016->175|1060->199|1104->217|1149->242|1195->260|1331->369|1346->375|1393->401|1466->447|1481->453|1535->486|1621->541|1654->544
                  LINES: 20->1|25->1|27->4|29->6|29->6|29->6|30->7|30->7|30->7|31->8|31->8|32->9|32->9|34->11|36->13|36->13|36->13|37->14|37->14|37->14|39->16|41->18
                  -- GENERATED --
              */
          