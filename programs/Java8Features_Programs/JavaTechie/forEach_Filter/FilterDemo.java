package programs.Java8Features_Programs.JavaTechie.forEach_Filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Hari");
        list.add("Krishna");
        list.add("Gopal");
        list.add("Vitthal");
        list.add("Kanha");

        for (String name : list){
            if (name.startsWith("K"))
                System.out.println(name);
        }

        list.stream().filter(name -> name.startsWith("K")).forEach(name -> System.out.println(name));


        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        map.put(6,"f");

        map.entrySet()
                .stream()
                .filter(k -> k.getKey() % 2 == 0)
                .forEach(v -> System.out.println(v.getValue()));

    }
}
