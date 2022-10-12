package programs.collection_programs;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("India");
        hs.add("is");
        hs.add("my");
        hs.add("country");
        hs.add("I");
        hs.add("love");
        hs.add("my");
        hs.add("country");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}