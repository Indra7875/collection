package programs.Java8Features_Programs.JavaTechie.FI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "No data found";
        System.out.println(supplier.get());

        List<Integer> integerList = Arrays.asList(10,20,30,40,50,60);
        int value = integerList.stream().filter(p -> p%2 !=0 ).findAny().orElseGet(() -> 1000);
        System.out.println(value);
    }
}
