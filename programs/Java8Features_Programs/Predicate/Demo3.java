package programs.Java8Features_Programs.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Ramesh",10000));
        list.add(new Employee("Suresh",20000));
        list.add(new Employee("Omkar",30000));
        list.add(new Employee("Vikas",40000));
        list.add(new Employee("Ranjit",50000));
        list.add(new Employee("Rushi",60000));

        Predicate<Employee> p = employee -> employee.salary > 30000;

        for (Employee e1 : list){
            if (p.test(e1)){
                System.out.println("Employee Name is  "+ e1.name+" Salary is "+e1.salary);
            }
        }



    }
}
