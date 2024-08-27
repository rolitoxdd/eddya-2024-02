public class Fib {

  public static int fib(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }

  public static void main(String[] a) {
    System.out.println(fib(1000));
  }

  // public static int fib(int n, int[] memo) {
  //   if (n <= 1) {
  //     return n;
  //   } else if (memo[n] != 0) {
  //     return memo[n];
  //   } else {
  //     memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
  //     return memo[n];
  //   }
  // }
}