package programs.collection_programs.Map;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        tm.put(1, "one");
        tm.put(3, "three");
        tm.put(2, "two");
        tm.put(6, "six");
        tm.put(4, "four");
        tm.put(5, "five");
        tm.put(7, "seven");
        tm.put(9, "nine");
        tm.put(8, "eight");
        tm.put(10, "ten");

        System.out.println(tm);

        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            System.out.println("key : " + entry.getKey() + " \n value : " +
                    entry.getValue());
        }
    }
}
