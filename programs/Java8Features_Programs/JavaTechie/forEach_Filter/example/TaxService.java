package programs.Java8Features_Programs.JavaTechie.forEach_Filter.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public static List<Employee> evaluateTaxUsers(String input){
        return  (input.equalsIgnoreCase("tax")) ?
                DataBase.getEmployees().stream().filter(employee -> employee.getSalary() > 500000).collect(Collectors.toList())
              : DataBase.getEmployees().stream().filter(employee -> employee.getSalary() <= 500000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> empList = TaxService.evaluateTaxUsers("Tax");
        System.out.println(empList);
    }
}
