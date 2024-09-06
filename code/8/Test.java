import java.util.LinkedList;

public class Test {
  public static void main(String[] args) {
    LinkedList<Integer> x = new LinkedList<Integer>();

    x.add(3);
    x.add(5);

    x.add(7);
    
    x.add(1, 8);
    x.remove(2);
    System.out.println(x);
  }
}