package interview_ques;

import java.util.Arrays;
import java.util.List;

public class AllDivisible {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(2,4,5,6,8);

        // Que. Check if all the list elements are divisible by 2, if yes print "All the numbers are
        // divisible by 2" else print "All the numbers are not divisible by 2" using java8 features.
        boolean result = listInt.stream().allMatch(i -> i%2 == 0);

       String strResult = result ? "All the numbers are divisible by 2" : "All the numbers are not divisible by 2";
       System.out.println(strResult);

        // Que. Check if any the list elements are divisible by 2, if yes print "At least one number are
        // divisible by 2" else print "Not a single number are not divisible by 2" using java8 features.
        boolean resultAt_least = listInt.stream().anyMatch(i -> i%2 == 0);

        String str_Result = resultAt_least ? "At least one number are divisible by 2" : "Not a single number are not divisible by 2";
        System.out.println(str_Result);

    }
}
