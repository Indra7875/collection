package programs.Java8Features_Programs.BiFunctional_Interface;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class Demo3_BiConsumer {
    public static void main(String[] args) {
        ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
        populate(listOfEmployees);

        BiConsumer<Employee,Double> biConsumer = (emp, d) -> emp.salary = emp.salary + d;

        for (Employee employee : listOfEmployees){
            biConsumer.accept(employee,525.25);

            System.out.println("Employee Name :" +employee.name);
            System.out.println("Employee Salary :" + employee.salary);
        }
    }
    public static void populate(ArrayList<Employee> listOfEmployees){
       listOfEmployees.add(new Employee("Amar",10000));
       listOfEmployees.add(new Employee("Suresh",20000));
       listOfEmployees.add(new Employee("Ramesh",30000));
       listOfEmployees.add(new Employee("Rahul",40000));
       listOfEmployees.add(new Employee("Vikas",50000));
    }
}
