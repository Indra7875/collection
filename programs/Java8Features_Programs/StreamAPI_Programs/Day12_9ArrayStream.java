package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.Arrays;

public class Day12_9ArrayStream {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.stream(intArray).forEach(System.out::println);
    }
}
