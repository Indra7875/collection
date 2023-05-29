#### Consumer FI
- It is perform the operation and does not return any value (return type is void)
- Consumer <T> ---> void 
- It contains accept(T t) method.

```
interface Consumer<T>
{
    public void accept(T t);
}
```
```
package programs.Java8Features_Programs.Consumer;

import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        Consumer <String>  c = s -> System.out.println(s);

        c.accept("Pune");
        c.accept("Mumbai");
    }
}

```
```
package programs.Java8Features_Programs.Consumer;

public class Student {
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}

package programs.Java8Features_Programs.Consumer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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

        Predicate<Student> p = s -> s.marks >= 60;

        Consumer<Student> c = s1 -> {
            System.out.println("Name of the student "+s1.name);
            System.out.println("Marks of student "+s1.marks);
            System.out.println("Grade of student "+f.apply(s1));
            if (p.test(s1)){
                System.out.println("Very Good in Academics");
            }
            System.out.println();
        };

        Student[] s = {
                new Student("Suresh",99),
                new Student("Ramesh",65),
                new Student("Vikas",55),
                new Student("Ram",45),
                new Student("Rocky",25)
        };

        for (Student s1 : s){
            c.accept(s1);
        }
    }
}

```

#### Consumer Chaining :
```
package programs.Java8Features_Programs.Consumer;

import java.util.function.Consumer;

public class Demo3 {
    public static void main(String[] args) {
        Consumer<Movie> c1 = m -> System.out.println(m.name+"  ready to release");
        Consumer<Movie> c2 = m -> System.out.println(m.name+" released but it is bigger flop");
        Consumer<Movie> c3 = m -> System.out.println(m.name+" storing information in database");
        Consumer<Movie> cc = c1.andThen(c2).andThen(c3);

        Movie m = new Movie("Spider");
        cc.accept(m);
    }
}

```