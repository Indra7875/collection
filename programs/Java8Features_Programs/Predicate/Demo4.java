package programs.Java8Features_Programs.Predicate;

import java.util.function.Predicate;

public class Demo4 {
    public static void main(String[] args) {
        int[] arrayOfInt = {0,5,10,15,20,25,30,35};

        Predicate<Integer> p1 = num -> num % 2 == 0; // Predicate for Even number

        Predicate<Integer> p2 = num -> num > 10;    // Predicate for > 10 number

        // and(), or(), negate()

        System.out.println("The numbers which are even AND grater than 10 are :");
        for (int n1 : arrayOfInt) {
            if (p1.and(p2).test(n1)) {
                System.out.println(n1);
            }
        }

        System.out.println("The numbers which are even OR grater than 10 are :");
        for (int n2 : arrayOfInt) {
                if (p1.or(p2).test(n2)) {
                    System.out.println(n2);
                }
        }

        System.out.println("The numbers which are NOT even are :");
        for (int n3 : arrayOfInt) {
                if (p1.negate().test(n3)) {
                    System.out.println(n3);
                }
        }
    }
}
