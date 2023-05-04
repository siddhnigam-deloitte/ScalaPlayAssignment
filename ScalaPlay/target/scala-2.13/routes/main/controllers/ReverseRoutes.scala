// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:9
package controllers {

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def updateUser(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "update")
    }
  
    // @LINE:10
    def getUser(userId:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("userId", userId)))
    }
  
    // @LINE:9
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addUser")
    }
  
    // @LINE:13
    def countUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "countUsers")
    }
  
    // @LINE:11
    def getAllUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
  }

  // @LINE:15
  class ReverseMatchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def getAllmatches(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getAllMatches")
    }
  
    // @LINE:16
    def getmatch(matchid:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Match/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("matchid", matchid)))
    }
  
  }

  // @LINE:18
  class ReverseTimesWinController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def getwin(team:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "win/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("team", team)))
    }
  
    // @LINE:19
    def getAllWins(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getallwins")
    }
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
