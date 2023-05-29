package programs.Java8Features_Programs.JavaTechie.forEach_Filter.example;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Employee> getEmployees(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(176,"Roshan","IT",600000));
        empList.add(new Employee(388,"Bikash","Civil",900000));
        empList.add(new Employee(470,"Bimal","Defence",500000));
        empList.add(new Employee(624,"Sourav","Core",400000));
        empList.add(new Employee(176,"Praksh","Social",1200000));

        return empList;
    }
}
