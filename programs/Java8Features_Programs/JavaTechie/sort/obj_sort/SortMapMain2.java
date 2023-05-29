package programs.Java8Features_Programs.JavaTechie.sort.obj_sort;

import java.util.*;

public class SortMapMain2 {
    public static void main(String[] args) {

        Map<Employee,Integer> employeeMap = new TreeMap<>((e1,e2) -> (int)(e2.getSalary() - e1.getSalary()));
        employeeMap.put(new Employee(176,"Roshan","IT",600000),60);
        employeeMap.put(new Employee(388,"Bikash","Civi",900000),90);
        employeeMap.put(new Employee(470,"Bimal","Defence",500000),50);
        employeeMap.put(new Employee(624,"Sourabh","Core",400000),40);
        employeeMap.put(new Employee(284,"Prakash","Social",1200000),120);

        System.out.println(employeeMap);


        Map<Employee,Integer> map = new HashMap<>();
        map.put(new Employee(176,"Roshan","IT",600000),60);
        map.put(new Employee(388,"Bikash","Civi",900000),90);
        map.put(new Employee(470,"Bimal","Defence",500000),50);
        map.put(new Employee(624,"Sourabh","Core",400000),40);
        map.put(new Employee(284,"Prakash","Social",1200000),120);

        Map<Employee,Integer> treeMap1 = new TreeMap<>((e1,e2) -> e2.getId() - e1.getId());
        treeMap1.putAll(map);
        System.out.println(treeMap1);

        Map<Employee,Integer> treeMap2 = new TreeMap<>(Comparator.comparing(Employee::getName).reversed());
        treeMap2.putAll(map);
        System.out.println(treeMap2);


        LinkedHashMap<Employee,Integer> sortedMap1 = new LinkedHashMap<>();

         employeeMap.entrySet().stream().sorted((e1,e2)-> e1.getKey().getDept().compareTo(e2.getKey().getDept()))
                .forEachOrdered(x -> sortedMap1.put(x.getKey(),x.getValue()));

        System.out.println(sortedMap1);



        LinkedHashMap<Employee,Integer> sortedMap2 = new LinkedHashMap<>();

        employeeMap.entrySet().stream().sorted(Comparator.comparing(e -> e.getKey().getId()))
                .forEachOrdered(x -> sortedMap2.put(x.getKey(),x.getValue()));

        System.out.println(sortedMap2);


        LinkedHashMap<Employee,Integer> sortedMap3 = new LinkedHashMap<>();

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
                .forEachOrdered(x -> sortedMap3.put(x.getKey(),x.getValue()));

        System.out.println(sortedMap3);


    }
}
