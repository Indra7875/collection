package interview_ques;

import java.util.stream.Stream;

public class ReverseTheNum {
    // Reverse the number
    public static void main(String[] args) {
        int num = 123456;

        // Reversed the number as Integer
        int reversedNumber = reverseNumber(num);
        System.out.println(reversedNumber);

        // Reversed the number using String
        int reverseNum = reverseNum(num);
        System.out.println(reverseNum);
    }

    // Reversed the number as Integer
    public static int reverseNumber(int num) {

        int reverseNum = 0;

        while (num > 0) {
            int reminder = num % 10;
            reverseNum = reverseNum * 10 + reminder;
            num = num / 10;
        }
        return reverseNum;
    }

    // Reversed the number using String
    public static int reverseNum(int num) {

        int reversNum = Stream.of(num)
                .map(i -> String.valueOf(i))
                .map(i -> new StringBuilder(i).reverse().toString())
                .mapToInt(Integer::parseInt)
                .findFirst()
                .orElse(0);

        return reversNum;
    }
}
