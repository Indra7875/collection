package programs.Java8Features_Programs.JavaTechie.map_flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customerList = EkartDataBase.getAll();
        System.out.println(customerList);

        List<String> emailList = customerList.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emailList);

        List<List<String>> phoneNumList1 = customerList.stream().map(customer -> customer.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(phoneNumList1);

        List<String> phoneNumList2 = customerList.stream().flatMap(customer -> customer.getPhoneNumber().stream()).collect(Collectors.toList());
        System.out.println(phoneNumList2);
    }
}
