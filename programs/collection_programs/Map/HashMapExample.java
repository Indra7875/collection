package programs.collection_programs.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Spider Man");
        hm.put(2, "Iorn Man");
        hm.put(4, "Hulk");
        hm.put(5, "Thor");
        hm.put(3, "Black widow");
        hm.put(5, "Thor-Love and Thunder");

        System.out.println(hm);

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " \n Movie Name : " + entry.getValue());
        }
    }
}
