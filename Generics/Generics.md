#### Generics in Java :
- The java generics programming is introduced in J2SE 5 to deal with type safe objects.
- It makes the code more stable by detecting the bugs at compile time.
- Before the generics, we can store any type of object in collection. Now generics force the java programmer to store a specific type of the objects.

**Advantage of Java Generics :-**
- There are three main advantages of generics.
- 1) Type Safety 
  2) Type Casting is not Required
  3) Compile-Time Checking
<br>
1) Type-Safety :-
- We can hold only a single type of objects in generics. It does not allow to store other objects.
  
```
package programs.Generics;

import java.util.ArrayList;
import java.util.List;

public class TypeSafe_Generics {
    public static void main(String[] args) {
        // without generics
        List list1 = new ArrayList();
        list1.add("ABC");
        list1.add(23.6f);
        list1.add(100);

        // with generics
        List<String> list2 = new ArrayList<String>();
        list2.add("ABC");
        // list2.add(23.6f); compile time error
        // list2.add(100); compile time error

        System.out.println("list1 " + list1 + "\nlist2 " + list2);
    }
}

```
2) Type Casting is not Required :-
- There is no need to typecast the object. Before the generic we need to type cast.

```
package programs.Generics;

import java.util.ArrayList;
import java.util.List;

public class NoTypeCast_Generics {
    public static void main(String[] args) {
        // without generics
        List list1 = new ArrayList();
        list1.add("Hiii");
        String str1 = (String) list1.get(0); // type-casting is required
        System.out.println(str1);

        // with generics
        List<String> list2 = new ArrayList<String>();
        list2.add("Byeee");
        String str2 = list2.get(0); // type-casting is not required
        System.out.println(str2);

    }
}

```
3) Compile-Time Checking :-
- It is checked at compile time so problem will not occur at runtime.
- It is a good strategy to check the program at compile time than runtime.

```
package programs.Generics;

import java.util.ArrayList;
import java.util.List;

public class CompileTimeCheck_Generic {
    public static void main(String[] args) {
        // using generic
        List<String> list = new ArrayList<String>();
        list.add("hello");
        // list.add(100); compile time error
        System.out.println(list);
    }
}

```

