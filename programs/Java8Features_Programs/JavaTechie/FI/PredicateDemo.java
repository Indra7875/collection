package programs.Java8Features_Programs.JavaTechie.FI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = p -> p%2 == 0;
        System.out.println(predicate.test(6));


        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        integerList.stream().filter(p -> p%2 == 0).forEach(c -> System.out.println("Print Even "+c));
    }
}
