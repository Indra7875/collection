package programs.collection_programs;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ExamplePQueueInteger {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(7);

        Iterator<Integer> qValue = pQueue.iterator();

        while (qValue.hasNext()) {
            System.out.print(qValue.next() + " ");
        }

        System.out.println();

        System.out.println(pQueue.peek());

        System.out.println(pQueue.poll());

        for (Integer integer : pQueue) {
            System.out.print(integer + " ");
        }

        System.out.println();
        System.out.println(pQueue.peek());
    }
}
