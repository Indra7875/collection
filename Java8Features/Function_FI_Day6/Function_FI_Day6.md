#### Function Functional Interface 
- If we want to perform some operation and get the result as return value that time Function FI is used.
- input ---> perform operation ---> output 
- 4 ---> square operation ---> 16

```
interface Function<T,R> // T = input value, R = return value
{
    public R apply(T t);
}
```
- It contains apply(T t) method.
- Function interface takes input value as well as return value.
  
```
package programs.Java8Features_Programs.Function;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {

        // Example1
        Function <Integer,Integer> f1 = i -> i*i;
        System.out.println(f1.apply(4));
        System.out.println(f1.apply(5));

        // Example2
        Function <String,Integer> f2 = i -> i.length();
        System.out.println(f2.apply("Indrajit"));

        // Example3
        Function <String,String> f3 = i -> i.toUpperCase();
        System.out.println(f3.apply("Indrajit"));
    }
}

```
```
package programs.Java8Features_Programs.Function;

public class Student {
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}

package programs.Java8Features_Programs.Function;

import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {

        Function<Student,String> f = s -> {
         String grade = "";
         if(s.marks >= 80) grade = "A[Distinction]";
         else if(s.marks >= 60) grade = "B[First Class]";
         else if(s.marks >= 50) grade = "C[Second Class]";
         else if(s.marks >= 35) grade = "D[Third Class]";
         else grade = "Failed";
         return grade;
        };

        Student[] s = {
                new Student("Suresh",99),
                new Student("Ramesh",65),
                new Student("Vikas",55),
                new Student("Ram",45),
                new Student("Rocky",25)
        };

        for (Student s1 : s){
            System.out.println("Name of the student "+s1.name);
            System.out.println("Marks of student "+s1.marks);
            System.out.println("Grade of student "+f.apply(s1));
            System.out.println();
        }
    }
}

```
```
package programs.Java8Features_Programs.Function;

public class Student {
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}

package programs.Java8Features_Programs.Function;

import java.util.function.Function;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {

        Function<Student,String> f = s -> {
         String grade = "";
         if(s.marks >= 80) grade = "A[Distinction]";
         else if(s.marks >= 60) grade = "B[First Class]";
         else if(s.marks >= 50) grade = "C[Second Class]";
         else if(s.marks >= 35) grade = "D[Third Class]";
         else grade = "Failed";
         return grade;
        };

        Predicate<Student> p = s -> s.marks >= 60;

        Student[] s = {
                new Student("Suresh",99),
                new Student("Ramesh",65),
                new Student("Vikas",55),
                new Student("Ram",45),
                new Student("Rocky",25)
        };

        for (Student s1 : s){
            if(p.test(s1)){
                System.out.println("Name of the student "+s1.name);
                System.out.println("Marks of student "+s1.marks);
                System.out.println("Grade of student "+f.apply(s1));
                System.out.println();
            }
        }
    }
}

```
#### Function Chaining :
- f1.andThen(f2).apply(i) > First f1 followed by f2
- f1.compose(f2).apply(i) > First f2 then f1  

```
package programs.Java8Features_Programs.Function;

import java.util.function.Function;

public class Demo4 {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = i -> 2 * i;
        Function<Integer,Integer> f2 = i -> i * i * i;

        System.out.println(f1.andThen(f2).apply(2));  // 64
        System.out.println(f1.compose(f2).apply(2));  // 16
    }
}

```