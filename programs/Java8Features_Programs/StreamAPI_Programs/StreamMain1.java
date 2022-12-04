package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain1 {
    public static void main(String[] args) {

        // Q) Create a List and Filter all even numbers from List

        List<Integer> list1 = List.of(2,4,50,21,22,67);

        List<Integer> list2 = Arrays.asList(23,45,676,54,38,97);

        List<Integer> list3 = new ArrayList<>();
        list3.add(56);
        list3.add(46);
        list3.add(87);

        // List 1
        // without stream
        List<Integer> listEven1 = new ArrayList<>();

        for (Integer i: list1) {
            if(i % 2 == 0)
            {
                listEven1.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven1);

        // using stream
        // example 1
        List<Integer> listEven2 = list1.stream()
                .filter(e -> e%2 == 0) // for filter need to pass predicate (true/false)
                .collect(Collectors.toList()); // to collect the result into List
        System.out.println(listEven2);

        // example 2
        List<Integer> listGraterThanFifteen = list1.stream()
                .filter(e -> e > 15)
                .collect(Collectors.toList());
        System.out.println(listGraterThanFifteen);
    }
}
