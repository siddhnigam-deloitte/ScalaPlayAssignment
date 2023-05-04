// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMatchController MatchController = new controllers.ReverseMatchController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTimesWinController TimesWinController = new controllers.ReverseTimesWinController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMatchController MatchController = new controllers.javascript.ReverseMatchController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTimesWinController TimesWinController = new controllers.javascript.ReverseTimesWinController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
