package programs.Java8Features_Programs.JavaTechie.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(8);
        integerList.add(3);
        integerList.add(12);
        integerList.add(4);

        System.out.println(integerList);

        Collections.sort(integerList);
        System.out.println(integerList);

        Collections.reverse(integerList);
        System.out.println(integerList);

        integerList.stream().sorted().forEach(c -> System.out.print(" "+c));

        System.out.println();

        integerList.stream().sorted(Comparator.reverseOrder()).forEach(c -> System.out.print(" "+c));



    }
}
