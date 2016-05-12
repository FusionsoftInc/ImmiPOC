
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object employerViewPage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class employerViewPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.EmployerForm],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(emplr: List[models.EmployerForm])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import controllers.routes

Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Show forms and New Form")/*5.33*/ {_display_(Seq[Any](format.raw/*5.35*/("""

        """),format.raw/*7.9*/("""<table class="table table-bordered table-hover" style="width: 500px">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Organization</th>
                <th>Visa Type</th>
                <th>Initiation</th>
                <th>Email Id</th>
            </tr>

            <tbody>
            """),_display_(/*18.14*/for(elist <- emplr ) yield /*18.34*/ {_display_(Seq[Any](format.raw/*18.36*/("""

                """),format.raw/*20.17*/("""<tr>
                    <td>"""),_display_(/*21.26*/elist/*21.31*/.fname),format.raw/*21.37*/("""</td>
                    <td>"""),_display_(/*22.26*/elist/*22.31*/.lname),format.raw/*22.37*/("""</td>
                    <td>"""),_display_(/*23.26*/elist/*23.31*/.organization),format.raw/*23.44*/("""</td>
                    <td>"""),_display_(/*24.26*/elist/*24.31*/.visaType),format.raw/*24.40*/("""</td>
                    <td>"""),_display_(/*25.26*/elist/*25.31*/.initiation),format.raw/*25.42*/("""</td>
                    <td>"""),_display_(/*26.26*/elist/*26.31*/.emailId),format.raw/*26.39*/("""</td>

                    <td><a href="http://localhost:9000/updateemplr?emId="""),_display_(/*28.74*/elist/*28.79*/.emailId),format.raw/*28.87*/("""">Update</a></td>
                    <td><a href="http://localhost:9000/deleteemplr?emId="""),_display_(/*29.74*/elist/*29.79*/.emailId),format.raw/*29.87*/("""" >Delete</a></td>
                </tr>
            """)))}),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""</tbody>
        </table>

        <div>
            <a href=""""),_display_(/*36.23*/routes/*36.29*/.EmployerController.addEmplrData()),format.raw/*36.63*/("""" >Add</a>

        </div>

""")))}),format.raw/*40.2*/("""
"""))
      }
    }
  }

  def render(emplr:List[models.EmployerForm],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(emplr)(request)

  def f:((List[models.EmployerForm]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (emplr) => (request) => apply(emplr)(request)

  def ref: this.type = this

}


}

/**/
object employerViewPage extends employerViewPage_Scope0.employerViewPage
              /*
                  -- GENERATED --
                  DATE: Sun May 01 20:37:18 EDT 2016
                  SOURCE: /home/srikar/scala-projects/ImmigrationApplication/app/views/employerViewPage.scala.html
                  HASH: 4b3fad4cf45c33b798ede88b07accdb0abff75ac
                  MATRIX: 582->1|769->68|797->97|824->99|863->130|902->132|938->142|1318->495|1354->515|1394->517|1440->535|1497->565|1511->570|1538->576|1596->607|1610->612|1637->618|1695->649|1709->654|1743->667|1801->698|1815->703|1845->712|1903->743|1917->748|1949->759|2007->790|2021->795|2050->803|2157->883|2171->888|2200->896|2318->987|2332->992|2361->1000|2446->1054|2487->1067|2577->1130|2592->1136|2647->1170|2706->1199
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|30->7|41->18|41->18|41->18|43->20|44->21|44->21|44->21|45->22|45->22|45->22|46->23|46->23|46->23|47->24|47->24|47->24|48->25|48->25|48->25|49->26|49->26|49->26|51->28|51->28|51->28|52->29|52->29|52->29|54->31|55->32|59->36|59->36|59->36|63->40
                  -- GENERATED --
              */
          