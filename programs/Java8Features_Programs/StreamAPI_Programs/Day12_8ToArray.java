package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;

public class Day12_8ToArray {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(0);
        intList.add(10);
        intList.add(-4);
        intList.add(87);
        intList.add(-53);
        intList.add(-63);
        System.out.println(intList);

        Integer[] intArray = intList.stream().toArray(Integer[]::new);

        System.out.println(intArray); // print the address of array

        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
