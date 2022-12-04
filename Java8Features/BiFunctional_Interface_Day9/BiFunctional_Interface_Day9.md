#### Normal FI :
- It is taken as single input argument.

```
Predicate ---> test()
Function ---> apply()
Consumer ---> accept()
Supplier ---> get()
```
#### BiFunctional Interface :
- It is taken as two input arguments.

1) BiPredicate

```
package programs.Java8Features_Programs.BiFunctional_Interface;

import java.util.function.BiPredicate;

public class Demo1_Predicate {
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> biPredicate = (a,b) -> (a + b) % 2 == 0;
        System.out.println(biPredicate.test(10,20));
        System.out.println(biPredicate.test(15,20));
    }
}

```
2) BiFunction :

```
package programs.Java8Features_Programs.BiFunctional_Interface;

public class Student {
    int studentId;
    String studentName;

    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }
}

package programs.Java8Features_Programs.BiFunctional_Interface;

public class Department {
    int deptId;
    String deptName;

    Department(int deptId, String deptName){
        this.deptId = deptId;
        this.deptName = deptName;
    }
}

package programs.Java8Features_Programs.BiFunctional_Interface;

public class Sheet {
    int studentId;
    String studentName;
    int deptId;
    String deptName;

    Sheet(int deptId, String deptName, int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Sheet{" + "Department Id=" + deptId + ", Department Name='" + deptName + '\'' + ", Student Id=" + studentId + ", Student Name='" + studentName + '\'' + '}'+'\n';

    }
}

package programs.Java8Features_Programs.BiFunctional_Interface;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Demo2_BiFunction {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(11,"Ramesh"));
        studentList.add(new Student(12,"Suresh"));
        studentList.add(new Student(13,"Rohit"));
        studentList.add(new Student(14,"Mahesh"));
        studentList.add(new Student(15,"Ruturaj"));
        
        ArrayList<Department> departmentList = new ArrayList<Department>();
        departmentList.add(new Department(01,"Physics"));
        departmentList.add(new Department(02,"Maths"));
        departmentList.add(new Department(03,"Chemistry"));
        departmentList.add(new Department(04,"History"));

        ArrayList<Sheet> listOfSheets = new ArrayList<Sheet>();

        BiFunction<ArrayList<Department>,ArrayList<Student>,ArrayList<Sheet>> biFunction = (dlist, slist) ->{

            listOfSheets.add(new Sheet(dlist.get(0).deptId, dlist.get(0).deptName, slist.get(0).studentId, slist.get(0).studentName));
            listOfSheets.add(new Sheet(dlist.get(1).deptId, dlist.get(1).deptName, slist.get(1).studentId, slist.get(1).studentName));
            listOfSheets.add(new Sheet(dlist.get(2).deptId, dlist.get(3).deptName, slist.get(2).studentId, slist.get(2).studentName));
            listOfSheets.add(new Sheet(dlist.get(3).deptId, dlist.get(3).deptName, slist.get(3).studentId, slist.get(3).studentName));
            listOfSheets.add(new Sheet(dlist.get(0).deptId, dlist.get(0).deptName, slist.get(4).studentId, slist.get(4).studentName));

            return listOfSheets;
        };

        biFunction.apply(departmentList,studentList);
        System.out.println(listOfSheets);
    }
}

```

3) BiConsumer :

```
package programs.Java8Features_Programs.BiFunctional_Interface;

public class Employee {
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
}

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

```

4) BiSupplier :
- BiSupplier concept is not there because we can not provide any input argument in supplier.
- So there is no meaning for BiSupplier concept.