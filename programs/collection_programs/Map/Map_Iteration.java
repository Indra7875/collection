package programs.Map;

import java.util.HashMap;
import java.util.Map;

public class Map_Iteration {
    public static void main(String[] args) {
        Map<String, Float> map = new HashMap<String, Float>();
        map.put("Apple", 29.39f);
        map.put("Mango", 98.78f);
        map.put("Banana", 80.67f);
        map.put("Grapes", 50.16f);
        map.put("Pineapple", 65.01f);
        map.put("Kiwi", 13.10f);

        System.out.println(map);
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            System.out.println("Fruit Name : " + entry.getKey() + " \n Price : " + entry.getValue());
        }
    }
}
