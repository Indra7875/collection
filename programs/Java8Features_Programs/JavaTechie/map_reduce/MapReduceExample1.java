package programs.Java8Features_Programs.JavaTechie.map_reduce;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,7,8,1,5,9);

        int sum1 = 0;
        for (int num : numbers){
            sum1 += num;
        }
        System.out.println(sum1);

        int sum2 = numbers.stream().mapToInt(v -> v).sum();
        System.out.println(sum2);

        int sum3 = numbers.stream().reduce(0,(a,b)-> a+b).intValue();
        System.out.println(sum3);

        int sum4 = numbers.stream().reduce(Integer::sum).get();
        System.out.println(sum4);

        int maxValue = numbers.stream().reduce(0,(a,b) -> a > b ? a : b ).intValue();
        System.out.println(maxValue);

        int maxValueMethodRef = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxValueMethodRef);
    }
}
