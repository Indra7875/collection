#### Predefined Functional Interfaces :
- An Interface that contains exactly one abstract method is known as functional interface. 
- It can have any number of default, static methods but can contain only one abstract method. 
- It can also declare methods of object class.
- Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. 
- It is a new feature in Java, which helps to achieve functional programming approach.
- @FunctionalInterface annotation used to annotate it.
**Predefined Functional Interfaces :**
1) predicate
2) Function
3) Consumer
4) Supplier

**Two Argument Predefined Functional Interfaces :**
1) BiPredicate
2) BiFunction
3) BiConsumer

**Primitive Functional Interfaces :**
1) IntPredicate
2) IntFunction
3) IntConsumer

**Note :**
- All functional interfaces present in package > java.util.function

#### Predicate Functional Interface :
- It is used for condition checking (TRUE/FALSE)

```
package programs.Java8Features_Programs.Predicate;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i%2 == 0;  // Creating predicate
        System.out.println(p1.test(10));   // Calling Predicate method
        System.out.println(p1.test(15));

        Predicate<String> p2 = s -> s.length() > 5;
        System.out.println(p2.test("Indrajit"));
    }
}
```
```
package programs.Java8Features_Programs.Predicate;

import java.util.function.Predicate;

public class Demo2 {
    static Predicate<String> str = s -> s.length() > 6;  // Predicate can use as static/non-static
    public static void main(String[] args) {
        String [] names = {"Vijay","Lankeshwar","Mahamahim","Sukumar","Rushi","Chakravarti","Sam","Ajay"};
        for(String s : names){
            if(str.test(s)){
                System.out.println(s);
            }
        }
    }
}

```
```
package programs.Java8Features_Programs.Predicate;

public class Employee {
    String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
}


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

```

#### Predicate Joining 
- p1 ----> to check whether the number is even or odd
- p2 ----> to check whether the number is grater than 10 or not
```
p1.add(p2).test(34)
p1.or(p2).test(29)
p1.negate()
```
```
package programs.Java8Features_Programs.Predicate;

import java.util.function.Predicate;

public class Demo4 {
    public static void main(String[] args) {
        int[] arrayOfInt = {0,5,10,15,20,25,30,35};

        Predicate<Integer> p1 = num -> num % 2 == 0; // Predicate for Even number

        Predicate<Integer> p2 = num -> num > 10;    // Predicate for > 10 number

        // and(), or(), negate()

        System.out.println("The numbers which are even AND grater than 10 are :");
        for (int n1 : arrayOfInt) {
            if (p1.and(p2).test(n1)) {
                System.out.println(n1);
            }
        }

        System.out.println("The numbers which are even OR grater than 10 are :");
        for (int n2 : arrayOfInt) {
                if (p1.or(p2).test(n2)) {
                    System.out.println(n2);
                }
        }

        System.out.println("The numbers which are NOT even are :");
        for (int n3 : arrayOfInt) {
                if (p1.negate().test(n3)) {
                    System.out.println(n3);
                }
        }
    }
}

```