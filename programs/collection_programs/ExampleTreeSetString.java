package programs.collection_programs;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSetString {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Rakesh");
        ts.add("Vijay");
        ts.add("Rakesh");
        ts.add("Anjani");

        System.out.println();
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        for (String value : ts) {
            System.out.println(value);
        }

    }
}
