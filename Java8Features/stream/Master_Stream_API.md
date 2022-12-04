### Stream API
#### Content  
- Introduction to Stream API
- Java code without stream vs with stream api.
- How to create the object of Stream and processing data.
- filter and map methods with example.
- Other important methods and operations such as collect(), sorted(), min(),max(), forEach(), toArrays(), and stream.of().

####  Introduction to Stream API
- It is Introduced in JDK 1.8
- Stream API is basically perform bulk operations and process the objects of collection.
- Streams reduced the code length.
- These streams are related to Collection Frameworks/group of objects. These streams are very different from io stream (for read write operation io streams are used)
- Stream is the interface, it's present in java.util.stream package.

**Example : StreamMain1**
- List.of(element1,element2..)
- We can create the List using List.of() method but we can not modify it again.
- It is create as Immutable type of object.
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain1 {
    public static void main(String[] args) {

        // Q) Create a List and Filter all even numbers from List

        List<Integer> list1 = List.of(2,4,50,21,22,67);

        List<Integer> list2 = Arrays.asList(23,45,676,54,38,97);

        List<Integer> list3 = new ArrayList<>();
        list3.add(56);
        list3.add(46);
        list3.add(87);

        // List 1
        // without stream
        List<Integer> listEven1 = new ArrayList<>();

        for (Integer i: list1) {
            if(i % 2 == 0)
            {
                listEven1.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven1);

        // using stream
        // example 1
        List<Integer> listEven2 = list1.stream()
                .filter(e -> e%2 == 0) // for filter need to pass predicate (true/false)
                .collect(Collectors.toList()); // to collect the result into List
        System.out.println(listEven2);

        // example 2
        List<Integer> listGraterThanFifteen = list1.stream()
                .filter(e -> e > 15)
                .collect(Collectors.toList());
        System.out.println(listGraterThanFifteen);
    }
}

```

**How to get Stream Object ?**
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        String[] names = {"Indrajit","Ram","Vishal","Vivek","Divya","Aniket","Uttam"};

        Stream<String> namesStream = Stream.of(names);
        namesStream.forEach(e -> {
            System.out.println(e);
        });
    }
}
```

#### Stream Operations Important Stream methods 
```
package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.List;

public class Imp_Methods {
    public static void main(String[] args) {

        /*
            filter(takes Predicate values which return TRUE/FALSE)
            boolean value function
            e -> e > 10
        */

        /*
            map (takes function which return value)
            each element operation
         */

        List <String> nameList = List.of("Amar","Ankit","Aniket","Ram","Sham","Abhi");
        nameList.stream().filter(e-> e.startsWith("A"))
                .forEach(e -> System.out.println(e));

        List <Integer> num_List = List.of(1,2,3,4,5,6,7,8,9,10);
        num_List.stream().map(i -> i*i)
                .forEach(i -> System.out.println(i));

       int minNum = num_List.stream()
               .min((x,y) -> x.compareTo(y))
               .get();
       System.out.println("Minimum number from list is "+ minNum);

       int maxNum = num_List.stream()
               .max((x,y) -> x.compareTo(y))
               .get();
        System.out.println("Maximum number from list is "+ maxNum);

    }
}
```