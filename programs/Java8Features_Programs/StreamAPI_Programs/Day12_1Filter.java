package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day12_1Filter {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        listInt.add(0);
        listInt.add(5);
        listInt.add(10);
        listInt.add(15);
        listInt.add(20);
        listInt.add(25);
        System.out.println(listInt);

        List<Integer> evenList = listInt.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenList);
    }
}