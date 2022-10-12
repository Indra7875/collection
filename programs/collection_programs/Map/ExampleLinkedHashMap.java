package programs.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

        lhm.put(1, "one");
        lhm.put(3, "three");
        lhm.put(2, "two");
        lhm.put(6, "six");
        lhm.put(4, "four");
        lhm.put(5, "five");
        lhm.put(7, "seven");
        lhm.put(9, "nine");
        lhm.put(8, "eight");
        lhm.put(10, "ten");

        System.out.println(lhm);

        System.out.println("Getting value for key 6 : " + lhm.get(6));
        System.out.println("Size of the map : " + lhm.size());
        System.out.println("Is map empty ? " + lhm.isEmpty());
        System.out.println("Contains key 9 ? " + lhm.containsKey(9));
        System.out.println("Contains value 'ten' ? " + lhm.containsValue("ten"));
        System.out.println("delete element 1 " + lhm.remove(1));

        for (Map.Entry<Integer, String> entry : lhm.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " \n value : " + entry.getValue());
        }

    }
}
