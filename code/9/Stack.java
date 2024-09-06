
public class Stack {
  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  Node head;

  public void push(int data) {
    if (head == null) {
      head = new Node(data);
      return;
    }
    Node newHead = new Node(data);
    newHead.next = head;
    head = newHead;
  }

  public int peek() {
    if (head == null) {
      return -1;
    }
    return head.data;
  }

  public int pop() {
    if (head == null) {
      return -1;
    }
    int data = head.data;
    head = head.next;
    return data;
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(3);

    stack.push(9);
    stack.push(7);
    stack.push(23);
    System.out.println(stack.peek()); // 23
    System.out.println(stack.pop()); // 23
    System.out.println(stack.peek()); // 7

  }
}
