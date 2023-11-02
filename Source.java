import java.util.ArrayList;

class Node<T> {
  T val;
  Node<T> next;
  public static int first = 0;
  public static int second = 1;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static int sumList(Node<Integer> head) {
    int nodeSum = 0;
    while (head != null) {
      nodeSum += head.val;
      head = head.next;
    }
    return nodeSum;
  }

  public static Node<Integer> fibNode() {
    Node<Integer> result = new Node<>(Node.second);
    int hold = Node.first + Node.second;
    Node.first = Node.second;
    Node.second = hold;
    return result;
  }

  public static void main(String[] args) {
    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(8);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(-1);
    Node<Integer> e = new Node<>(7);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;


    // 2 -> 8 -> 3 -> -1 -> 7
    
    System.out.println("Sum of my list: ");
    System.out.println(Source.sumList(a));

    ArrayList<Node<Integer>> fibNodes = new ArrayList<>();
    Node<Integer> oldNode = null;
    final int LIMIT = 800000000;
    while (Node.second < LIMIT) {
      Node<Integer> newNode = fibNode();
      fibNodes.add(newNode);
      if (oldNode != null) {
        oldNode.next = newNode;
      }
      oldNode = newNode;
    }
    System.out.println("Sum of all fibonacci numbers under " + LIMIT + ":");
    System.out.println(Source.sumList(fibNodes.get(0)));
    System.out.println("Fib nodes: ");
    for (Node node : fibNodes) {
      System.out.println(node.val);
    }
    System.out.println("Number of fibonacci numbers under " + LIMIT + ":");
    System.out.println(fibNodes.size());
  }
}
