package programs.Java8Features_Programs.BiFunctional_Interface;

import java.util.function.BiPredicate;

public class Demo1_BiPredicate {
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> biPredicate = (a,b) -> (a + b) % 2 == 0;
        System.out.println(biPredicate.test(10,20));
        System.out.println(biPredicate.test(15,20));
    }
}
