package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day12_4SortedCustom {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        marks.add(20);
        marks.add(25);
        System.out.println(marks);

        List<Integer> sortedMarkList = marks.stream()
                .sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0))
                .collect(Collectors.toList());

        System.out.println(sortedMarkList);
    }
}