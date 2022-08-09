package programs;

import java.util.ArrayDeque;

public class ExampleArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> aDeque = new ArrayDeque<Integer>();

        aDeque.add(10);
        aDeque.add(20);
        aDeque.add(30);
        aDeque.add(40);
        aDeque.add(50);

        System.out.println(aDeque);

        aDeque.clear();

        aDeque.addFirst(664);
        aDeque.addFirst(978);

        aDeque.addLast(32);
        aDeque.addLast(13);

        System.out.println(aDeque);
    }
}
