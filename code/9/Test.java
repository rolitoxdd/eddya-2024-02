import java.util.Queue;
import java.util.LinkedList;

public class Test {

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    q.add(1);
    q.add(2);
    q.add(3);

    System.out.println(q.peek()); // 1
    q.poll(); // remove 1
    System.out.println(q.peek()); // 2
  }

}
