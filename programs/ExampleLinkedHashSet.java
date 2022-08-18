package programs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("India");
        lhs.add("is");
        lhs.add("my");
        lhs.add("country");
        lhs.add("I");
        lhs.add("love");
        lhs.add("my");
        lhs.add("country");

        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
