#### Collection and Stream :
- If we want to represent a group of objects as a single entity then we should go for **collection**.
- If we want to process objects from the collection then use **Stream**.
- Stream s = c.stream();
- It is present in java.util.stream package

- **stream()** : to given stream object
- **filter(Predicate)** : to filter elements based on given condition
- **map(Function)** : to modify elements
- **collect()** : to collect the result
- **count()** :  to count number of elements
- **sorted()** :
  - to sort the elements ( by default ascending order )(internally i1.compareTo(i2))
  - for the customized sorting (descending order) must provide comparator argument
  - Comparator ---> compare(obj1, obj2) ---> i2.compareTo(i1)
  - returns +ve (1) if obj1 < obj2
  - returns -ve (-1) if obj1 > obj2
  - returns 0 if obj1 == obj2
    - (i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0

- **min() / max()** : It gives min / max value based on sorting.
- **forEach(Function)** : It is act like for each loop, which takes the function.
- **toArray()** : To convert stream of objects into array.
- **Arrays.stream(array_obj)** : We can use stream concept to array also using Arrays.stream() method.
- **Stream.of()** : we can use stream concept to group of object also using Stream.of() method.

```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day12_1Filter {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        listInt.add(0);
        listInt.add(5);
        listInt.add(10);
        listInt.add(15);
        listInt.add(20);
        listInt.add(25);
        System.out.println(listInt);

        List<Integer> evenList = listInt.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenList);
    }
}
```
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day12_2Map {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(0);
        marks.add(5);
        marks.add(10);
        marks.add(20);
        marks.add(25);
        marks.add(30);
        System.out.println(marks);

        List<Integer> updatedMarks = marks.stream()
                .map(i -> i + 5)
                .collect(Collectors.toList());
        System.out.println(updatedMarks);
    }
}

```
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;

public class Day12_3Count {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        marks.add(20);
        marks.add(25);
        System.out.println(marks);

        long noOfFailedStudents = marks.stream()
                .filter(m -> m < 35)
                .count();

        System.out.println("Number of failed students are " + noOfFailedStudents);

    }
}

```
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day12_4SortedDefault {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        marks.add(20);
        marks.add(25);
        System.out.println(marks);

        List<Integer> sortedMarkList = marks.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedMarkList);
    }
}

```
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day12_4SortedCustom {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        marks.add(20);
        marks.add(25);
        System.out.println(marks);

        List<Integer> sortedMarkList = marks.stream()
                .sorted((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0))
                .collect(Collectors.toList());

        System.out.println(sortedMarkList);
    }
}
```
```
package programs.Java8Features_Programs.StreamAPI_Programs;
// Que sort the given string by it's length and if the length is equal the sort it by alphabetically.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day12_4SortedString {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        listString.add("A");
        listString.add("AAAA");
        listString.add("AA");
        listString.add("BBB");
        listString.add("AAA");

        System.out.println(listString);

        Comparator<String> c = (s1, s2) -> {
            if (s1.length() < s2.length())
                return -1;
            else if (s1.length() > s2.length())
                return 1;
            else
                return s1.compareTo(s2);
        };

        List<String> sortedList = listString.stream()
                .sorted(c)
                .collect(Collectors.toList());

        System.out.println(sortedList);

    }
}

```
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;

public class Day12_5Min {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0);
        list.add(15);
        list.add(5);
        list.add(20);
        System.out.println(list);

        Integer minNumber = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(minNumber);
    }
}

```
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;

public class Day12_6Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0);
        list.add(15);
        list.add(5);
        list.add(20);
        System.out.println(list);

        Integer maxNumber = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(maxNumber);
    }
}

```
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Day12_7ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        System.out.println(list);

        list.stream().forEach(System.out::println);

        Consumer<Integer> c = i -> {
            System.out.println("The Square of " + i + " is : " + (i * i));
        };
        list.stream().forEach(c);

        list.stream().forEach(i -> {
            System.out.println("The Cube of " + i + " is : " + (i * i * i));
        });
    }
}

```
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;

public class Day12_8ToArray {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(0);
        intList.add(10);
        intList.add(-4);
        intList.add(87);
        intList.add(-53);
        intList.add(-63);
        System.out.println(intList);

        Integer[] intArray = intList.stream().toArray(Integer[]::new);

        System.out.println(intArray); // print the address of array

        for (int i : intArray) {
            System.out.println(i);
        }
    }
}

```
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.Arrays;

public class Day12_9ArrayStream {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Arrays.stream(intArray).forEach(System.out::println);
    }
}

```
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.stream.Stream;

public class Day12_10StreamOf {
     public static void main(String[] args) {
          Stream.of("Geeks").forEach(System.out::println);

          Stream.of(9, 99, 999, 9999, 99999).forEach(System.out::println);

     }

}

```

#### stream.map() Vs stream.flatMap() :

| **stream.map()**                                                 | **stream.flatMap()**                                                                         |
| ---------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| 1. There is one-to-one mapping between input and output element. | 1. There is one-to-many mapping between input and output element.                            |
| 2. For single input value we will get single output value.       | 2. For multiple input values we flatten the values so that we will get single output stream. |
| 3. For single input list we will get output as in single list.   | 3. For multiple input list we will get output as in single list.                             |


```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day13_1FlatMap {
    public static void main(String[] args) {
        List<Integer> listInt1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> listInt2 = Arrays.asList(6, 7, 8, 9, 10);

        List<List<Integer>> listOfListInt = Arrays.asList(listInt1, listInt2);

        System.out.println(listOfListInt);

        List<Integer> resultList = listOfListInt.stream().flatMap(l -> l.stream()).collect(Collectors.toList());

        System.out.println(resultList);

        listOfListInt.stream().flatMap(l -> l.stream()).filter(i -> i % 2 == 0).forEach(System.out::print);
    }
}

```