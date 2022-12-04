package programs.Java8Features_Programs.Predicate;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i%2 == 0;  // Creating predicate
        System.out.println(p1.test(10));   // Calling Predicate method
        System.out.println(p1.test(15));

        Predicate<String> p2 = s -> s.length() > 5;
        System.out.println(p2.test("Indrajit"));
    }
}
