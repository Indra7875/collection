#### Java 17 New Features :
#### 1. Record Classes 
- The class is created only for data transfer purpose.
- Client --> request --> Server --> Database --> fetch the data --> stored in class (Created the object) --> send response to the client.
- This data transfer/storing object should immutable.
- This object only used for data storing purpose.
**Before Record class**
- For creating data transfer/ storing class we need to have 
- i) class
- ii) The private final variables 
- iii) For initializing final variables required argument constructor 
- iv) For print the object values required to override toString() method.
- v) To compare the object values required to override compare() & hasCode() method.

```
package programs.java_17_features_programs;

class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }

}

public class WithoutRecord {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Indrajit");
        System.out.println(s1.getId()); // print Id using getId()
        System.out.println(s1.getName()); // print name using getName()

        System.out.println(s1); // print object data using toString()

        // create obj having same data
        Student s2 = new Student(1, "Indrajit");
        System.out.println(s2.getId()); // print Id using getId()
        System.out.println(s2.getName()); // print name using getName()

        System.out.println(s2); // print object data using toString()

        System.out.println(s1.equals(s2)); // compare the value inside obj using equals() and hashCode()
    }

}


```

- For creating two variable it will take at least 40 lines of code

**Before Record class**
- For creating data transfer/ storing class we need to have only record class_name (arguments)
- 40 lines of code is replaced by only 1 line. 
- Record class having variable_name() methods for get the data.
- We can not create non-static variables inside record class we should create it within the record class constructor only.
- We can not extend record class to simple class, we can extends record class to record class only.
- We can implement interface to record class.

```
package programs.java_17_features_programs;

record Student1(int id, String name){
    
}

public class WithRecord {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1, "Indrajit");
        System.out.println(s1.id()); // print id using id()
        System.out.println(s1.name()); // print name using name()

        System.out.println(s1); // print object data using toString()

        // create obj having same data
        Student1 s2 = new Student1(1, "Indrajit");
        System.out.println(s1.id()); // print id using id()
        System.out.println(s1.name()); // print name using name()

        System.out.println(s2); // print object data using toString()

        System.out.println(s1.equals(s2)); // compare the value inside obj using equals() and hashCode()
    }
}

```

#### 2. Sealed Classes
- As we know abstract class we can inherited but final class we can not inherited it.
- Sealed class gives permit to inherits only specific classes
- For creating sealed class we use **sealed** keyword before the class name and use **permits** give class using semicolon. 
```
sealed class A permits B,C {

}
```
- The child classes which extends sealed class A i.e B and C which should be either final/sealed/non-sealed.

```
package programs.java_17_features_programs;

sealed class A permits B,C {
    
}

non-sealed class B extends A {
    
}

final class C extends A  {
    
}

class D extends B {
    
}

public class DemoSealedClass {
    public static void main(String[] args) {
        
    }
}

```
- sealed class can extend other class and also implement to the interface.

```
package programs.java_17_features_programs;

sealed class A extends Thread implements Cloneable permits B,C {

}

non-sealed class B extends A {

}

final class C extends A  {

}

class D extends B {

}

public class DemoSealedClass {
    public static void main(String[] args) {

    }
}

```

- It also applicable for interfaces but final is not allowed for interface.

```
sealed interface X permits Y {

}

non-sealed interface Y extends X {

}
```

#### 3. Switch Case Enhancement 
- Earlier In switch there is a case statements and in that we should provide the break keyword otherwise it will execute other case statements.
- Before JDK 5 switch supports only integer.
- After JDK 5 switch also supports String.

```
package programs.java_17_features_programs;

public class OldSwitch {
    public static void main(String[] args) {

        String day = "Sunday";

        switch (day){
            case "Saturday", "Sunday" :
                System.out.println("6 AM");
                break;
            case "Monday" :
                System.out.println("8 AM");
                break;
            default:
                System.out.println("7 AM");
        }
    }
}

``` 
- In switch enhancement ':' is replaced by '->' so that break is not required end of case.

```
package programs.java_17_features_programs;

public class NewSwitch {
    public static void main(String[] args) {
        String day = "Sunday";

        switch (day){
            case "Saturday", "Sunday" -> System.out.println("6 AM");
            case "Monday" -> System.out.println("8 AM");
            default -> System.out.println("7 AM");
        }
    }
}
```
- '->' also able to return the value 

```
package programs.java_17_features_programs;

public class NewSwitchReturn {
    public static void main(String[] args) {
        String month = "April";

       int days = switch (month){
            case "Jan" -> 31;
            case "March" -> 31;
            case "April" -> 30;
            case "May" -> 31;
            case "June" -> 30;
            case "July" -> 31;
            case "Aug" -> 31;
            case "Sept" -> 30;
            case "Oct" -> 31;
            case "Nov" -> 30;
            case "Dec" -> 31;
            default -> 29;
        };

        System.out.println(days);
    }
}

```
- We can replace '->' by ': yield'  

```
package programs.java_17_features_programs;

public class NewSwitchYield {
    public static void main(String[] args) {
        String month = "Feb";

        int days = switch (month){
            case "Jan" : yield  31;
            case "March" : yield 31;
            case "April" : yield 30;
            case "May" : yield 31;
            case "June" : yield 30;
            case "July" : yield 31;
            case "Aug" : yield 31;
            case "Sept" : yield 30;
            case "Oct" : yield 31;
            case "Nov" : yield 30;
            case "Dec" : yield 31;
            default : yield 29;
        };

        System.out.println(days);
    }
}

```