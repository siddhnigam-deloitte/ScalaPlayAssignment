// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers {

  // @LINE:9
  class ReverseMatchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def getAllmatches(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getAllMatches")
    }
  
    // @LINE:10
    def getmatch(matchid:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Match/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("matchid", matchid)))
    }
  
  }

  // @LINE:12
  class ReverseTimesWinController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def getwin(team:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "win/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("team", team)))
    }
  
    // @LINE:13
    def getAllWins(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getallwins")
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
