package programs.Java8Features_Programs.Function;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {

        // Example1
        Function <Integer,Integer> f1 = i -> i*i;
        System.out.println(f1.apply(4));
        System.out.println(f1.apply(5));

        // Example2
        Function <String,Integer> f2 = i -> i.length();
        System.out.println(f2.apply("Indrajit"));

        // Example3
        Function <String,String> f3 = i -> i.toUpperCase();
        System.out.println(f3.apply("Indrajit"));
    }
}
