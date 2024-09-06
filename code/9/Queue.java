public class Queue {
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head, tail;

  public void enqueue(int value) {
    Node newNode = new Node(value);
    if (tail != null) {
      tail.next = newNode;
    } else {
      head = newNode;
    }
    tail = newNode;
  }

  public int peek() {
    return head.data;
  }

  public int dequeue() {
    int value = head.data;
    head = head.next;
    if (head == null) {
      tail = null;
    }
    return value;
  }

  public static void main(String[] args) {
    Queue q = new Queue();

    q.enqueue(5);
    q.enqueue(7);
    q.enqueue(23);

    System.out.println(q.peek()); // 5
    q.dequeue();
    System.out.println(q.peek()); // 7
  }
}
