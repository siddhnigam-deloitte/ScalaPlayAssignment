// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers.javascript {

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateUser",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update"})
        }
      """
    )
  
    // @LINE:10
    def getUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getUser",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:9
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser"})
        }
      """
    )
  
    // @LINE:13
    def countUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.countUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "countUsers"})
        }
      """
    )
  
    // @LINE:11
    def getAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getAllUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseMatchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def getAllmatches: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MatchController.getAllmatches",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllMatches"})
        }
      """
    )
  
    // @LINE:16
    def getmatch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MatchController.getmatch",
      """
        function(matchid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Match/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("matchid", matchid0))})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseTimesWinController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def getwin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TimesWinController.getwin",
      """
        function(team0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "win/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("team", team0))})
        }
      """
    )
  
    // @LINE:19
    def getAllWins: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TimesWinController.getAllWins",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getallwins"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
