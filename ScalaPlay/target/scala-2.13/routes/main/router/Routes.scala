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
  MatchController_0: controllers.MatchController,
  // @LINE:13
  TimesWinController_1: controllers.TimesWinController,
  // @LINE:17
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    MatchController_0: controllers.MatchController,
    // @LINE:13
    TimesWinController_1: controllers.TimesWinController,
    // @LINE:17
    Assets_2: controllers.Assets
  ) = this(errorHandler, MatchController_0, TimesWinController_1, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MatchController_0, TimesWinController_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getAllMatches""", """controllers.MatchController.getAllmatches()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Match/""" + "$" + """matchid<[^/]+>""", """controllers.MatchController.getmatch(matchid:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Matches/""" + "$" + """team<[^/]+>""", """controllers.MatchController.getmatchesbyteam(team:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """win/""" + "$" + """team<[^/]+>""", """controllers.TimesWinController.getwin(team:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getallwins""", """controllers.TimesWinController.getAllWins()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_MatchController_getAllmatches0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getAllMatches")))
  )
  private[this] lazy val controllers_MatchController_getAllmatches0_invoker = createInvoker(
    MatchController_0.getAllmatches(),
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

  // @LINE:10
  private[this] lazy val controllers_MatchController_getmatch1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Match/"), DynamicPart("matchid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MatchController_getmatch1_invoker = createInvoker(
    MatchController_0.getmatch(fakeValue[Int]),
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

  // @LINE:11
  private[this] lazy val controllers_MatchController_getmatchesbyteam2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Matches/"), DynamicPart("team", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MatchController_getmatchesbyteam2_invoker = createInvoker(
    MatchController_0.getmatchesbyteam(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MatchController",
      "getmatchesbyteam",
      Seq(classOf[String]),
      "GET",
      this.prefix + """Matches/""" + "$" + """team<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_TimesWinController_getwin3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("win/"), DynamicPart("team", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TimesWinController_getwin3_invoker = createInvoker(
    TimesWinController_1.getwin(fakeValue[String]),
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

  // @LINE:14
  private[this] lazy val controllers_TimesWinController_getAllWins4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getallwins")))
  )
  private[this] lazy val controllers_TimesWinController_getAllWins4_invoker = createInvoker(
    TimesWinController_1.getAllWins(),
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

  // @LINE:17
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
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
    case controllers_MatchController_getAllmatches0_route(params@_) =>
      call { 
        controllers_MatchController_getAllmatches0_invoker.call(MatchController_0.getAllmatches())
      }
  
    // @LINE:10
    case controllers_MatchController_getmatch1_route(params@_) =>
      call(params.fromPath[Int]("matchid", None)) { (matchid) =>
        controllers_MatchController_getmatch1_invoker.call(MatchController_0.getmatch(matchid))
      }
  
    // @LINE:11
    case controllers_MatchController_getmatchesbyteam2_route(params@_) =>
      call(params.fromPath[String]("team", None)) { (team) =>
        controllers_MatchController_getmatchesbyteam2_invoker.call(MatchController_0.getmatchesbyteam(team))
      }
  
    // @LINE:13
    case controllers_TimesWinController_getwin3_route(params@_) =>
      call(params.fromPath[String]("team", None)) { (team) =>
        controllers_TimesWinController_getwin3_invoker.call(TimesWinController_1.getwin(team))
      }
  
    // @LINE:14
    case controllers_TimesWinController_getAllWins4_route(params@_) =>
      call { 
        controllers_TimesWinController_getAllWins4_invoker.call(TimesWinController_1.getAllWins())
      }
  
    // @LINE:17
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
