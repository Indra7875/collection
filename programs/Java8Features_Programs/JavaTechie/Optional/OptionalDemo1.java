package programs.Java8Features_Programs.JavaTechie.Optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) throws Throwable {
        Customer customer = new Customer(101,"john","abc@gmail.com", Arrays.asList("9867456766","7756887699"));

        // empty()
        // of(T value)
        // ofNullable(T value)

        Optional optional = Optional.empty();
        System.out.println(optional);

//        Optional ofOptional = Optional.of(customer.getEmail());
//        System.out.println(ofOptional);

        Optional ofNullableOptional = Optional.ofNullable(customer.getEmail());
        System.out.println(ofNullableOptional);

        if (ofNullableOptional.isPresent()){
            System.out.println("email id is : " +ofNullableOptional.get());
        }
        System.out.println(ofNullableOptional.orElse("default@gmail.com"));

        System.out.println(ofNullableOptional.map(v -> v.toString().toUpperCase()).orElseThrow(()-> new IllegalArgumentException("No email found")));


    }
}
