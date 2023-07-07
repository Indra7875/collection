package programs.Java8Features_Programs.JavaTechie.Optional;

import java.util.List;

public class OptionalDemo2 {

    public static Customer getCustomerByEmailId(String emailId){
        List<Customer> customerList = EkartDataBase.getAll();
        return customerList.stream().filter(c -> c.getEmail().equals(emailId)).findAny().get();
    }
    public static void main(String[] args) {
       Customer customer = OptionalDemo2.getCustomerByEmailId("john@gmail.com");
        System.out.println(customer);
    }
}
