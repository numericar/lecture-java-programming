package L24_collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();

        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);

        ll1.addFirst(10);
        ll1.addLast(10);

        System.out.println(ll1.peekFirst());
        System.out.println(ll1.peekLast());


        for (Integer x : ll1) {
            System.out.println(x);
        }
    }
}
