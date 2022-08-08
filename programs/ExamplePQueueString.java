package programs;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ExamplePQueueString {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();

        pQueue.add("Indrajit");
        pQueue.add("Rajesh");
        pQueue.add("Rananavare");
        pQueue.add("Maharashtra");

        Iterator<String> qValue = pQueue.iterator();

        while (qValue.hasNext()) {
            System.out.print(qValue.next() + " ");
        }

        System.out.println();

        System.out.println(pQueue.peek());

        System.out.println(pQueue.poll());

        for (String str : pQueue) {
            System.out.print(str + " ");
        }

        System.out.println();
        System.out.println(pQueue.peek());
    }
}
