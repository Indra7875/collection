package programs.Java8Features_Programs.JavaTechie.FI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = c -> System.out.println("Printing "+c);
        consumer.accept(100);

        List<Integer> listOfInt = Arrays.asList(10,20,30,40,50,60);
        listOfInt.stream().forEach(c -> System.out.println("Print "+c));
    }
}
