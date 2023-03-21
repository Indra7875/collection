package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;

public class Day12_6Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0);
        list.add(15);
        list.add(5);
        list.add(20);
        System.out.println(list);

        Integer maxNumber = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(maxNumber);
    }
}
