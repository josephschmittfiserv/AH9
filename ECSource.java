class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    Node<T> unique = head;

    while (head != null) {
      if (unique.val != head.val) {
        return false;
      } else
        head = head.next;
    }
    return true;
  }

  public static void main(String[] args) {
    // Node<String> z = new Node<>("z");
    // // z

    // Node<Integer> u = new Node<>(2);
    // Node<Integer> v = new Node<>(2);
    // Node<Integer> w = new Node<>(2);
    // Node<Integer> x = new Node<>(2);
    // Node<Integer> y = new Node<>(2);

    // u.next = v;
    // v.next = w;
    // w.next = x;
    // x.next = y;

    Node<Integer> u = new Node<>(2);
    Node<Integer> v = new Node<>(2);
    Node<Integer> w = new Node<>(3);
    Node<Integer> x = new Node<>(3);
    Node<Integer> y = new Node<>(2);

    u.next = v;
    v.next = w;
    w.next = x;
    x.next = y;

    // Printing solution
    System.out.println((ECSource.isUnivalueList(u)));
  }
}
