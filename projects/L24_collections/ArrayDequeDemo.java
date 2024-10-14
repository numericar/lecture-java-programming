package L24_collections;

import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offerFirst(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);

        System.out.println("First: " + dq.pollFirst());
        System.out.println("Last: " + dq.pollLast());

        for (Integer x : dq) {
            System.out.println(x);
        }
    }
}
