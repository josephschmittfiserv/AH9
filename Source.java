class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> Node<T> reverseList(Node<T> head) {
    Node<T> curr = head;
    Node<T> prev = null;
    Node<T> next = null;

    while (curr != null) {
      // The purpose of next is to keep track of the current lists direction
      next = curr.next;
      // The purpose of prev is to keep track of the new direction of the list
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    // Assign head to prev which now has the correct list direction (reverse)
    head = prev;
    return head;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    Node<String> e = new Node<>("e");
    Node<String> f = new Node<>("f");

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;

    // Printing solution
    Node<String> head = Source.reverseList(a);

    while (head != null) {
      System.out.println(head.val);
      head = head.next;
    }
  }
}