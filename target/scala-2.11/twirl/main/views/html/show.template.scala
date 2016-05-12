
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object show_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class show extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Seq[String],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(lg: Seq[String])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import controllers.routes

Seq[Any](format.raw/*1.52*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Show forms and New Form")/*5.33*/ {_display_(Seq[Any](format.raw/*5.35*/("""

        """),format.raw/*7.9*/("""<table class="table table-bordered table-hover" style="width: 500px">
            <tr>
                <th>Emp Id</th>
            </tr>
            <tbody>


            """),_display_(/*14.14*/for(lglist <- lg) yield /*14.31*/ {_display_(Seq[Any](format.raw/*14.33*/("""
            """),format.raw/*15.13*/("""<tr>
                <td>"""),_display_(/*16.22*/lglist),format.raw/*16.28*/("""</td>
            </tr>
            """)))}),format.raw/*18.14*/("""
            """),format.raw/*19.13*/("""</tbody>
        </table>

""")))}),format.raw/*22.2*/("""

"""))
      }
    }
  }

  def render(lg:Seq[String],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(lg)(request)

  def f:((Seq[String]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (lg) => (request) => apply(lg)(request)

  def ref: this.type = this

}


}

/**/
object show extends show_Scope0.show
              /*
                  -- GENERATED --
                  DATE: Sun May 01 17:23:10 EDT 2016
                  SOURCE: /home/srikar/scala-projects/ImmigrationApplication/app/views/show.scala.html
                  HASH: 228d8062273cb3ae51ffc344636faa9e6d5c1161
                  MATRIX: 544->1|714->51|742->80|769->82|808->113|847->115|883->125|1082->297|1115->314|1155->316|1196->329|1249->355|1276->361|1344->398|1385->411|1443->439
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|30->7|37->14|37->14|37->14|38->15|39->16|39->16|41->18|42->19|45->22
                  -- GENERATED --
              */
          