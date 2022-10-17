package programs.collection_programs;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleComparator {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();

        al.add(new Employee(101, "Ram", 500000));
        al.add(new Employee(99, "Suresh", 300000));
        al.add(new Employee(105, "Krishna", 600000));
        al.add(new Employee(11, "Rahul", 100000));

        System.out.println("Printing Employee List :");

        for (Employee emp : al) {
            System.out.println("Employee Id : " + emp.empId + " Employee Name : " + emp.empName + " Employee Salary : "
                    + emp.empSal);
        }

        Collections.sort(al, new NameComparator());

        System.out.println("Sorting by Name :");

        for (Employee emp : al) {
            System.out.println("Employee Id : " + emp.empId + " Employee Name : " + emp.empName + " Employee Salary : "
                    + emp.empSal);
        }

        Collections.sort(al, new SalaryComparator());

        System.out.println("Sorting by Salary :");

        for (Employee emp : al) {
            System.out.println("Employee Id : " + emp.empId + " Employee Name : " + emp.empName + " Employee Salary : "
                    + emp.empSal);
        }
    }
}
