import java.util.LinkedList;
import java.util.Queue;

public class Test {
  public static void main(String[] args) {
    Queue<Integer> x = new LinkedList<Integer>();

    x.add(3);
    x.add(5);
    x.add(7);
    
    x.remove();
    x.add(8);
    System.out.println(x.peek());
  }
}