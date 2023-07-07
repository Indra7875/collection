package programs.Java8Features_Programs.JavaTechie.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101,"john","john@gmail.com", Arrays.asList("6768697766","646474744")),
                new Customer(102,"smith","smith@gmail.com",Arrays.asList("5634346764","536734532")),
                new Customer(103,"peter","peter@gmail.com",Arrays.asList("4756589875","7575648363")),
                new Customer(104,"kely","kely@gmail.com",Arrays.asList("9865746486","9866487337"))
                )
                .collect(Collectors.toList());

    }
}
