public class Good {
  public static void main(String[] args) {

    long startTime = System.nanoTime();
    // System.out.println(intToBin(5));
    System.out.println(intToBin(Long.MAX_VALUE - (long) 10000));
    long endTime = System.nanoTime();
    System.out.println("Total execution time: " + (endTime - startTime) + "ns");
  }

  static String intToBin(long n) {
    String s = "";
    while (n > 0) {
      s = (n % 2) + s;
      n /= (long)2;
    }
    return s;
  }
}
