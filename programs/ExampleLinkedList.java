package programs;

import java.util.LinkedList;

public class ExampleLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for (int i = 1; i <= 5; i++) {
            ll.add(i);
        }

        System.out.println(ll);
        ll.remove(3);

        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }

        System.out.println();

        for (Integer integer : ll) {
            System.out.print(integer + " ");
        }

    }
}