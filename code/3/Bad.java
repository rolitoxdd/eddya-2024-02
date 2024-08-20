
import java.util.HashSet;


public class Bad {
  public static void main(String[] args) {

    long startTime = System.nanoTime();
    System.out.println(intToBin(Long.MAX_VALUE - (long) 1000));
    long endTime = System.nanoTime();
    System.out.println("Total execution time: " + (endTime - startTime) + "ns");
  }

  static String intToBin(long n) {
    HashSet<Integer> set = new HashSet<>();
    String bin = "";
    int maxPow = 0;
    while (n > 0) {
      int i = 0;
      while (Math.pow(2, i) <= n) {
        i++;
      }
      i--;
      set.add(i);
      n -= (long) Math.pow(2, i);
      if (i > maxPow) {
        maxPow = i;
      }
    }

    for (int i = 0; i <= maxPow; i++) {
      if (!set.contains(i)) {
        bin = "0" + bin;
      } else {
        bin = "1" + bin;
      }
    }

    return bin;
  }
}