// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers.javascript {

  // @LINE:9
  class ReverseMatchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def getAllmatches: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MatchController.getAllmatches",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getAllMatches"})
        }
      """
    )
  
    // @LINE:10
    def getmatch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MatchController.getmatch",
      """
        function(matchid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Match/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("matchid", matchid0))})
        }
      """
    )
  
    // @LINE:11
    def getmatchesbyteam: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MatchController.getmatchesbyteam",
      """
        function(team0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Matches/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("team", team0))})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseTimesWinController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def getwin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TimesWinController.getwin",
      """
        function(team0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "win/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("team", team0))})
        }
      """
    )
  
    // @LINE:14
    def getAllWins: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TimesWinController.getAllWins",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getallwins"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
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
