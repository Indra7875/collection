import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSetInteger {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(34);
        ts.add(77);
        ts.add(12);
        ts.add(18);

        Iterator<Integer> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Lowest Value :" + ts.pollFirst());
        System.out.println("Highest Value :" + ts.pollLast());
    }
}
