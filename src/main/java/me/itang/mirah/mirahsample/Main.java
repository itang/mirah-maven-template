// Generated from fib.mirah
package me.itang.mirah.mirahsample;
public class Main extends java.lang.Object {
  public static void main(java.lang.String[] args) {
    int it = 0;
    me.itang.mirah.mirahsample.Fib f = null;
    it = (args.length > 0) ? (java.lang.Integer.parseInt(args[0])) : (1);
    java.io.PrintStream temp$1 = java.lang.System.out;
    temp$1.println(it);
    f = new me.itang.mirah.mirahsample.Fib();
    f.bench(it);
  }
}
