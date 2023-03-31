#### Java Enums
- Java Enum is introduced in JDK 1.5
- The Enum in Java is a data type which contains a fixed set of constants.
- Internally it can be thought of as class which have a fixed set of constants (a variable that dos not change). 
- The Java Enum constants are static and final implicitly.
- Constructor of enum type is private. If you don't declare private constructor then compiler internally creates private constructor.
- We unable to create instance of Enum because it contains private constructor only.
- Enum improves type safety.
- Enum can be easily used in switch.
- Enum can be traversed.
- Enum can have fields, constructors and methods.
- Enum may implement many interface but can not extends any class because it internally extends Enum class.

**Important Methods in Enum**
- Java compiler internally adds the values(), valueOf() and ordinal methods within the enum at compile time. It internally creates a static and final class for enum.
  
| **Methods**         | **Use**                                                |
| ------------------- | ------------------------------------------------------ |
| 1) values() method  | It returns an array containing all values of the enum. |
| 2) valueOf() method | It returns value of given constant enum.               |
| 3) ordinal() method | It returns the index of the enum value.                |

**Example 1 : Enum Defined inside the class**
```
package programs.Enum_Programs;

public class EnumExample1 {

    // defining the enum inside the class
    public enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }
}

```
**Example 2 : Enum Defined outside the class**
```
package programs.Enum_Programs;

// Defined enum outside the class 
enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample2 {
    public static void main(String[] args) {
        Days day = Days.MONDAY;
        System.out.println(day);
    }
}

```
**Example 3 : main method inside Enum**
```
package programs.Enum_Programs;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // Defining main method inside enum
    public static void main(String[] args) {
        Days day = Days.FRIDAY;
        System.out.println(day);
    }
}

```
**Example 4 : Example of specifying  initial value to the enum constants**
```
package programs.Enum_Programs;

public class EnumExample4 {
    enum Days {
        SUNDAY(10), MONDAY(20), TUESDAY(30), WEDNESDAY(40), THURSDAY(50),
        FRIDAY(60), SATURDAY(70);

        private int value;

        private Days(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        for (Days day : Days.values()) {
            System.out.println(day + " " + day.value);
        }
    }

}

```
**Example 5 : Applying Enum on a switch statement**
```
package programs.Enum_Programs;

public class Example5 {
    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Days day = Days.FRIDAY;
        switch (day) {
            case SUNDAY:
                System.out.println("Today is SUNDAY");
                break;
            case MONDAY:
                System.out.println("Today is MONDAY");
                break;
            case TUESDAY:
                System.out.println("Today is TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("Today is WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("Today is THURSDAY");
                break;
            case FRIDAY:
                System.out.println("Today is FRIDAY");
                break;
            case SATURDAY:
                System.out.println("Today is SATURDAY");
                break;
            default:
                System.out.println("Wrong DAY");
        }

    }
}
```