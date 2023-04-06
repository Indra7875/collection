package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day13_1FlatMap {
    public static void main(String[] args) {
        List<Integer> listInt1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> listInt2 = Arrays.asList(6, 7, 8, 9, 10);

        List<List<Integer>> listOfListInt = Arrays.asList(listInt1, listInt2);

        System.out.println(listOfListInt);

        List<Integer> resultList = listOfListInt.stream().flatMap(l -> l.stream()).collect(Collectors.toList());

        System.out.println(resultList);

        listOfListInt.stream().flatMap(l -> l.stream()).filter(i -> i % 2 == 0).forEach(System.out::print);
    }
}
