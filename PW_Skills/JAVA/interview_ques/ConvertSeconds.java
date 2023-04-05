package interview_ques;


import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class ConvertSeconds {
    public static void main(String[] args) {
        String time = "12:36:47";

        ToIntFunction<String>  f = i -> {
            String str1 = i.substring(0,2);
            String str2 = i.substring(3,5);
            String str3 = i.substring(6,8);

            int value1 = Integer.parseInt(str1);
            int value2 = Integer.parseInt(str2);
            int value3 = Integer.parseInt(str3);

            return (value1*60*60) + (value2*60) + value3;
        };

        int convertedToSec = Stream.of(time).mapToInt(f).sum();
        System.out.println(convertedToSec);

    }
}
