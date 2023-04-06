package interview_ques;

import java.util.Arrays;
import java.util.List;

public class StartWithOne {
    public static void main(String[] args) {

        // In the list of Integer print the numbers start with 1

        List<Integer> intList = Arrays.asList(1, 2, 3, 11, 12, 4, 5, 121, 24, 56, 111);

        intList.stream()
                .map(i -> i + "")
                .filter(i -> i.startsWith("1"))
                .map(i -> Integer.parseInt(i))
                .forEach(System.out::println);
    }
}
