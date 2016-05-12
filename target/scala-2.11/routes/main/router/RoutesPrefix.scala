
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/srikar/scala-projects/ImmiPOC/conf/routes
// @DATE:Wed May 11 20:14:26 EDT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
