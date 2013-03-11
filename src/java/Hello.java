import clojure.lang.RT;
import clojure.lang.Symbol;
import clojure.lang.Var;

/**
 * Little library to say Hello.
 **/
public class Hello {
  // Import require Var
  public static final Var REQUIRE=RT.var("clojure.core", "require");
  // Use REQUIRE Var to import all needed ns.
  static {
    REQUIRE.invoke(Symbol.intern("hello.core"));
  }
  
  // Bind all needed symbols (fns, vars, etc) to Vars
  public static final Var GREET=RT.var("hello.core", "greet");
  
  // Expose needed fns as Java methods
  
  /**
   * Greet someone.
   * 
   * @param name Name of who you want to greet.
   **/
  public static void greet(String name) {
    GREET.invoke(name);
  }
}