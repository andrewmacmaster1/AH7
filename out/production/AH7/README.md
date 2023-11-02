# AH7

Algo Hour 7

# Objective

Fork and clone this repo. Complete this objective and push your work up to YOUR fork.

Write a method, sumList, that takes in the head of a linked list containing integers as an argument. The method should return the total sum of all values in the linked list.

# Test Case

```java
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

    Source.sumList(a); // 19
```

# Extra Credit

Create and run your own test case.