package programs.Java8Features_Programs.JavaTechie.sort.obj_sort;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapMain1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("eight",8);
        map.put("four",4);
        map.put("ten",10);
        map.put("two",2);

        System.out.println(map);

        Map<String,Integer> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> v1, Map.Entry<String, Integer> v2) {
                return v1.getKey().compareTo(v2.getKey());
            }
        });
        System.out.println(list);

        Collections.sort(list,(v1,v2) -> v2.getKey().compareTo(v1.getKey()));
        System.out.println(list);

        Collections.sort(list,Map.Entry.comparingByValue());
        System.out.println(list);

        List<Map.Entry<String,Integer>> list1 = map.entrySet().stream().sorted((v1,v2) -> v2.getValue()- v1.getValue()).collect(Collectors.toList());
        System.out.println(list1);

        List<Map.Entry<String,Integer>> list2 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        System.out.println(list2);

    }
}
