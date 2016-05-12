
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/srikar/scala-projects/ImmiPOC/conf/routes
// @DATE:Wed May 11 20:14:26 EDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  LoginController_5: controllers.LoginController,
  // @LINE:22
  EmployerController_3: controllers.EmployerController,
  // @LINE:34
  EmployeeController_2: controllers.EmployeeController,
  // @LINE:40
  AttorneyController_0: controllers.AttorneyController,
  // @LINE:45
  MessageController_1: controllers.MessageController,
  // @LINE:56
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    LoginController_5: controllers.LoginController,
    // @LINE:22
    EmployerController_3: controllers.EmployerController,
    // @LINE:34
    EmployeeController_2: controllers.EmployeeController,
    // @LINE:40
    AttorneyController_0: controllers.AttorneyController,
    // @LINE:45
    MessageController_1: controllers.MessageController,
    // @LINE:56
    Assets_4: controllers.Assets
  ) = this(errorHandler, LoginController_5, EmployerController_3, EmployeeController_2, AttorneyController_0, MessageController_1, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LoginController_5, EmployerController_3, EmployeeController_2, AttorneyController_0, MessageController_1, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.LoginController.loginPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.validateLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.LoginController.regPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saveregister""", """controllers.LoginController.saveRegForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getregdata""", """controllers.LoginController.getRegistrationData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forgot""", """controllers.LoginController.forgotPassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """savepassword""", """controllers.LoginController.savePassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """thank""", """controllers.LoginController.thankYouPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employer""", """controllers.EmployerController.getInfoEmployer"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """saveemplr""", """controllers.EmployerController.saveInfoEmployer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateemplr""", """controllers.EmployerController.updateEmplrData(emId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updemplr""", """controllers.EmployerController.updateInfoEmployer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteemplr""", """controllers.EmployerController.deleteEmplrData(emId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addemplr""", """controllers.EmployerController.addEmplrData"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employee""", """controllers.EmployeeController.getEmployeeInfo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """attorney""", """controllers.AttorneyController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.MessageController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_LoginController_loginPage0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LoginController_loginPage0_invoker = createInvoker(
    LoginController_5.loginPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginPage",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_LoginController_validateLogin1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_validateLogin1_invoker = createInvoker(
    LoginController_5.validateLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "validateLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_LoginController_regPage2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_LoginController_regPage2_invoker = createInvoker(
    LoginController_5.regPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "regPage",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LoginController_saveRegForm3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saveregister")))
  )
  private[this] lazy val controllers_LoginController_saveRegForm3_invoker = createInvoker(
    LoginController_5.saveRegForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "saveRegForm",
      Nil,
      "POST",
      """""",
      this.prefix + """saveregister"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_LoginController_getRegistrationData4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getregdata")))
  )
  private[this] lazy val controllers_LoginController_getRegistrationData4_invoker = createInvoker(
    LoginController_5.getRegistrationData,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "getRegistrationData",
      Nil,
      "GET",
      """""",
      this.prefix + """getregdata"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_LoginController_forgotPassword5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forgot")))
  )
  private[this] lazy val controllers_LoginController_forgotPassword5_invoker = createInvoker(
    LoginController_5.forgotPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "forgotPassword",
      Nil,
      "GET",
      """""",
      this.prefix + """forgot"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_LoginController_savePassword6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("savepassword")))
  )
  private[this] lazy val controllers_LoginController_savePassword6_invoker = createInvoker(
    LoginController_5.savePassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "savePassword",
      Nil,
      "POST",
      """""",
      this.prefix + """savepassword"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_LoginController_thankYouPage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("thank")))
  )
  private[this] lazy val controllers_LoginController_thankYouPage7_invoker = createInvoker(
    LoginController_5.thankYouPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "thankYouPage",
      Nil,
      "GET",
      """""",
      this.prefix + """thank"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_EmployerController_getInfoEmployer8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employer")))
  )
  private[this] lazy val controllers_EmployerController_getInfoEmployer8_invoker = createInvoker(
    EmployerController_3.getInfoEmployer,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployerController",
      "getInfoEmployer",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """employer"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_EmployerController_saveInfoEmployer9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("saveemplr")))
  )
  private[this] lazy val controllers_EmployerController_saveInfoEmployer9_invoker = createInvoker(
    EmployerController_3.saveInfoEmployer,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployerController",
      "saveInfoEmployer",
      Nil,
      "POST",
      """""",
      this.prefix + """saveemplr"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_EmployerController_updateEmplrData10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateemplr")))
  )
  private[this] lazy val controllers_EmployerController_updateEmplrData10_invoker = createInvoker(
    EmployerController_3.updateEmplrData(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployerController",
      "updateEmplrData",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """updateemplr"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_EmployerController_updateInfoEmployer11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updemplr")))
  )
  private[this] lazy val controllers_EmployerController_updateInfoEmployer11_invoker = createInvoker(
    EmployerController_3.updateInfoEmployer,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployerController",
      "updateInfoEmployer",
      Nil,
      "POST",
      """""",
      this.prefix + """updemplr"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_EmployerController_deleteEmplrData12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteemplr")))
  )
  private[this] lazy val controllers_EmployerController_deleteEmplrData12_invoker = createInvoker(
    EmployerController_3.deleteEmplrData(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployerController",
      "deleteEmplrData",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """deleteemplr"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_EmployerController_addEmplrData13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addemplr")))
  )
  private[this] lazy val controllers_EmployerController_addEmplrData13_invoker = createInvoker(
    EmployerController_3.addEmplrData,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployerController",
      "addEmplrData",
      Nil,
      "GET",
      """""",
      this.prefix + """addemplr"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_EmployeeController_getEmployeeInfo14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employee")))
  )
  private[this] lazy val controllers_EmployeeController_getEmployeeInfo14_invoker = createInvoker(
    EmployeeController_2.getEmployeeInfo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeController",
      "getEmployeeInfo",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """employee"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_AttorneyController_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("attorney")))
  )
  private[this] lazy val controllers_AttorneyController_index15_invoker = createInvoker(
    AttorneyController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AttorneyController",
      "index",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """attorney"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_MessageController_index16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_MessageController_index16_invoker = createInvoker(
    MessageController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MessageController",
      "index",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Assets_versioned17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned17_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_LoginController_loginPage0_route(params) =>
      call { 
        controllers_LoginController_loginPage0_invoker.call(LoginController_5.loginPage)
      }
  
    // @LINE:7
    case controllers_LoginController_validateLogin1_route(params) =>
      call { 
        controllers_LoginController_validateLogin1_invoker.call(LoginController_5.validateLogin)
      }
  
    // @LINE:9
    case controllers_LoginController_regPage2_route(params) =>
      call { 
        controllers_LoginController_regPage2_invoker.call(LoginController_5.regPage)
      }
  
    // @LINE:10
    case controllers_LoginController_saveRegForm3_route(params) =>
      call { 
        controllers_LoginController_saveRegForm3_invoker.call(LoginController_5.saveRegForm)
      }
  
    // @LINE:11
    case controllers_LoginController_getRegistrationData4_route(params) =>
      call { 
        controllers_LoginController_getRegistrationData4_invoker.call(LoginController_5.getRegistrationData)
      }
  
    // @LINE:15
    case controllers_LoginController_forgotPassword5_route(params) =>
      call { 
        controllers_LoginController_forgotPassword5_invoker.call(LoginController_5.forgotPassword)
      }
  
    // @LINE:16
    case controllers_LoginController_savePassword6_route(params) =>
      call { 
        controllers_LoginController_savePassword6_invoker.call(LoginController_5.savePassword)
      }
  
    // @LINE:17
    case controllers_LoginController_thankYouPage7_route(params) =>
      call { 
        controllers_LoginController_thankYouPage7_invoker.call(LoginController_5.thankYouPage)
      }
  
    // @LINE:22
    case controllers_EmployerController_getInfoEmployer8_route(params) =>
      call { 
        controllers_EmployerController_getInfoEmployer8_invoker.call(EmployerController_3.getInfoEmployer)
      }
  
    // @LINE:23
    case controllers_EmployerController_saveInfoEmployer9_route(params) =>
      call { 
        controllers_EmployerController_saveInfoEmployer9_invoker.call(EmployerController_3.saveInfoEmployer)
      }
  
    // @LINE:24
    case controllers_EmployerController_updateEmplrData10_route(params) =>
      call(params.fromQuery[String]("emId", None)) { (emId) =>
        controllers_EmployerController_updateEmplrData10_invoker.call(EmployerController_3.updateEmplrData(emId))
      }
  
    // @LINE:25
    case controllers_EmployerController_updateInfoEmployer11_route(params) =>
      call { 
        controllers_EmployerController_updateInfoEmployer11_invoker.call(EmployerController_3.updateInfoEmployer)
      }
  
    // @LINE:26
    case controllers_EmployerController_deleteEmplrData12_route(params) =>
      call(params.fromQuery[String]("emId", None)) { (emId) =>
        controllers_EmployerController_deleteEmplrData12_invoker.call(EmployerController_3.deleteEmplrData(emId))
      }
  
    // @LINE:27
    case controllers_EmployerController_addEmplrData13_route(params) =>
      call { 
        controllers_EmployerController_addEmplrData13_invoker.call(EmployerController_3.addEmplrData)
      }
  
    // @LINE:34
    case controllers_EmployeeController_getEmployeeInfo14_route(params) =>
      call { 
        controllers_EmployeeController_getEmployeeInfo14_invoker.call(EmployeeController_2.getEmployeeInfo)
      }
  
    // @LINE:40
    case controllers_AttorneyController_index15_route(params) =>
      call { 
        controllers_AttorneyController_index15_invoker.call(AttorneyController_0.index)
      }
  
    // @LINE:45
    case controllers_MessageController_index16_route(params) =>
      call { 
        controllers_MessageController_index16_invoker.call(MessageController_1.index)
      }
  
    // @LINE:56
    case controllers_Assets_versioned17_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned17_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
