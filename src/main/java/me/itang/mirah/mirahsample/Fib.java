// Generated from fib.mirah
package me.itang.mirah.mirahsample;
public class Fib extends java.lang.Object {
  public static void main(java.lang.String[] argv) {
  }
  public int fib(int a) {
    return (a < 2) ? (a) : ((this.fib((a - 1)) + this.fib((a - 2))));
  }
  public java.lang.Object bench(int n) {
    int __xform_tmp_1 = 0;
    int __xform_tmp_2 = 0;
    long time_start = 0;
    __xform_tmp_1 = 0;
    __xform_tmp_2 = n;
    label1:
    while ((__xform_tmp_1 < __xform_tmp_2)) {
      label2:
       {
        time_start = java.lang.System.currentTimeMillis();
        java.io.PrintStream temp$3 = java.lang.System.out;
        temp$3.println("fib(45): " + this.fib(45) + "\nTotal time: " + (java.lang.System.currentTimeMillis() - time_start));
      }
      __xform_tmp_1 = (__xform_tmp_1 + 1);
    }
    return null;
  }
}
