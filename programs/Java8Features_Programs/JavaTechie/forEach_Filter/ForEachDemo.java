package programs.Java8Features_Programs.JavaTechie.forEach_Filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ramesh");
        list.add("Suresh");
        list.add("Raju");
        list.add("Rohit");
        list.add("Kiran");

        for (String name : list){
            System.out.println("Name is "+name);
        }

        list.stream().forEach(c -> System.out.println("Name = "+c));

        list.forEach(c -> System.out.println("My Name = "+c));


        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");

        map.forEach((key,value) -> System.out.println(key+" : "+value));

        map.entrySet().stream().forEach(obj -> System.out.println(obj));

    }
}
