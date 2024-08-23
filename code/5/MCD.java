class MCD {
  public static int mcd(int a, int b) {
    int r = a % b;
    while (r != 0) {
      a = b;
      b = r;
      r = a % b;
    }
    return b;
  }

  public static void main(String[] args) {
    int a = 24;
    int b = 18;
    System.out.println("MCD(" + a + ", " + b + ") = " + mcd(a, b));
  }
}