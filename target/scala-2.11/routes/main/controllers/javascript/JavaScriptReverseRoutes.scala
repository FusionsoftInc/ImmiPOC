
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/srikar/scala-projects/ImmiPOC/conf/routes
// @DATE:Wed May 11 20:14:26 EDT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:56
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseEmployerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def getInfoEmployer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployerController.getInfoEmployer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employer"})
        }
      """
    )
  
    // @LINE:26
    def deleteEmplrData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployerController.deleteEmplrData",
      """
        function(emId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteemplr" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("emId", emId0)])})
        }
      """
    )
  
    // @LINE:23
    def saveInfoEmployer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployerController.saveInfoEmployer",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveemplr"})
        }
      """
    )
  
    // @LINE:25
    def updateInfoEmployer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployerController.updateInfoEmployer",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updemplr"})
        }
      """
    )
  
    // @LINE:24
    def updateEmplrData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployerController.updateEmplrData",
      """
        function(emId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateemplr" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("emId", emId0)])})
        }
      """
    )
  
    // @LINE:27
    def addEmplrData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployerController.addEmplrData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addemplr"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def regPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.regPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:17
    def thankYouPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.thankYouPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "thank"})
        }
      """
    )
  
    // @LINE:10
    def saveRegForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.saveRegForm",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "saveregister"})
        }
      """
    )
  
    // @LINE:7
    def validateLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.validateLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:16
    def savePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.savePassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "savepassword"})
        }
      """
    )
  
    // @LINE:15
    def forgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.forgotPassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forgot"})
        }
      """
    )
  
    // @LINE:6
    def loginPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:11
    def getRegistrationData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.getRegistrationData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getregdata"})
        }
      """
    )
  
  }

  // @LINE:45
  class ReverseMessageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseAttorneyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AttorneyController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "attorney"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseEmployeeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def getEmployeeInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.getEmployeeInfo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee"})
        }
      """
    )
  
  }


}
