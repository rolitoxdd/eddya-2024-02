public class Good {
  public static void main(String[] args) {

    long startTime = System.nanoTime();
    System.out.println(intToBin(Long.MAX_VALUE - (long) 1000));
    long endTime = System.nanoTime();
    System.out.println("Total execution time: " + (endTime - startTime) + "ns");
  }

  static String intToBin(long n) {
    String s = "";
    long x = 2;
    while (n > 0) {
      s = (n % 2) + s;
      n /= x;
    }
    return s;
  }
}
