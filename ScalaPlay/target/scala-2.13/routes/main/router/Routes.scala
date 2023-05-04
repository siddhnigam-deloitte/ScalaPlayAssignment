// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  HomeController_0: controllers.HomeController,
  // @LINE:15
  MatchController_1: controllers.MatchController,
  // @LINE:18
  TimesWinController_2: controllers.TimesWinController,
  // @LINE:22
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    HomeController_0: controllers.HomeController,
    // @LINE:15
    MatchController_1: controllers.MatchController,
    // @LINE:18
    TimesWinController_2: controllers.TimesWinController,
    // @LINE:22
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_0, MatchController_1, TimesWinController_2, Assets_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, MatchController_1, TimesWinController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser""", """controllers.HomeController.addUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """userId<[^/]+>""", """controllers.HomeController.getUser(userId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.HomeController.getAllUsers()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update""", """controllers.HomeController.updateUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """countUsers""", """controllers.HomeController.countUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAllMatches""", """controllers.MatchController.getAllmatches()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Match/""" + "$" + """matchid<[^/]+>""", """controllers.MatchController.getmatch(matchid:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """win/""" + "$" + """team<[^/]+>""", """controllers.TimesWinController.getwin(team:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getallwins""", """controllers.TimesWinController.getAllWins()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_HomeController_addUser0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser")))
  )
  private[this] lazy val controllers_HomeController_addUser0_invoker = createInvoker(
    HomeController_0.addUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUser",
      Nil,
      "POST",
      this.prefix + """addUser""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_getUser1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getUser1_invoker = createInvoker(
    HomeController_0.getUser(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getUser",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """user/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_getAllUsers2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_HomeController_getAllUsers2_invoker = createInvoker(
    HomeController_0.getAllUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getAllUsers",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_updateUser3_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private[this] lazy val controllers_HomeController_updateUser3_invoker = createInvoker(
    HomeController_0.updateUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateUser",
      Nil,
      "PUT",
      this.prefix + """update""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_countUsers4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("countUsers")))
  )
  private[this] lazy val controllers_HomeController_countUsers4_invoker = createInvoker(
    HomeController_0.countUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "countUsers",
      Nil,
      "GET",
      this.prefix + """countUsers""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_MatchController_getAllmatches5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAllMatches")))
  )
  private[this] lazy val controllers_MatchController_getAllmatches5_invoker = createInvoker(
    MatchController_1.getAllmatches(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MatchController",
      "getAllmatches",
      Nil,
      "GET",
      this.prefix + """getAllMatches""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_MatchController_getmatch6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Match/"), DynamicPart("matchid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MatchController_getmatch6_invoker = createInvoker(
    MatchController_1.getmatch(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MatchController",
      "getmatch",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """Match/""" + "$" + """matchid<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_TimesWinController_getwin7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("win/"), DynamicPart("team", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TimesWinController_getwin7_invoker = createInvoker(
    TimesWinController_2.getwin(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TimesWinController",
      "getwin",
      Seq(classOf[String]),
      "GET",
      this.prefix + """win/""" + "$" + """team<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_TimesWinController_getAllWins8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getallwins")))
  )
  private[this] lazy val controllers_TimesWinController_getAllWins8_invoker = createInvoker(
    TimesWinController_2.getAllWins(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TimesWinController",
      "getAllWins",
      Nil,
      "GET",
      this.prefix + """getallwins""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_HomeController_addUser0_route(params@_) =>
      call { 
        controllers_HomeController_addUser0_invoker.call(HomeController_0.addUser())
      }
  
    // @LINE:10
    case controllers_HomeController_getUser1_route(params@_) =>
      call(params.fromPath[Int]("userId", None)) { (userId) =>
        controllers_HomeController_getUser1_invoker.call(HomeController_0.getUser(userId))
      }
  
    // @LINE:11
    case controllers_HomeController_getAllUsers2_route(params@_) =>
      call { 
        controllers_HomeController_getAllUsers2_invoker.call(HomeController_0.getAllUsers())
      }
  
    // @LINE:12
    case controllers_HomeController_updateUser3_route(params@_) =>
      call { 
        controllers_HomeController_updateUser3_invoker.call(HomeController_0.updateUser())
      }
  
    // @LINE:13
    case controllers_HomeController_countUsers4_route(params@_) =>
      call { 
        controllers_HomeController_countUsers4_invoker.call(HomeController_0.countUsers())
      }
  
    // @LINE:15
    case controllers_MatchController_getAllmatches5_route(params@_) =>
      call { 
        controllers_MatchController_getAllmatches5_invoker.call(MatchController_1.getAllmatches())
      }
  
    // @LINE:16
    case controllers_MatchController_getmatch6_route(params@_) =>
      call(params.fromPath[Int]("matchid", None)) { (matchid) =>
        controllers_MatchController_getmatch6_invoker.call(MatchController_1.getmatch(matchid))
      }
  
    // @LINE:18
    case controllers_TimesWinController_getwin7_route(params@_) =>
      call(params.fromPath[String]("team", None)) { (team) =>
        controllers_TimesWinController_getwin7_invoker.call(TimesWinController_2.getwin(team))
      }
  
    // @LINE:19
    case controllers_TimesWinController_getAllWins8_route(params@_) =>
      call { 
        controllers_TimesWinController_getAllWins8_invoker.call(TimesWinController_2.getAllWins())
      }
  
    // @LINE:22
    case controllers_Assets_versioned9_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
