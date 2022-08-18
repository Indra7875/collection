## Collection in Java :
- Any group of individual objects which are represent as a single unit is known as the collection of the objects.
- The collection interface (java.util.Collection) and Map interface (java.util.Map) are two main __root__ interfaces of java collection classes.

#### What is a Framework ?
- A framework is a set of classes and interfaces which provide a ready-made architecture.

#### Before Collection 
- None of these collections(Array,Vector or Hashtable) implements a standard member access interface, it was very difficult for programmers to write algorithms that can work for all kinds of Collections.

#### Advantages of Collection Framework :
1. Consistent API :
   - The API is the basic set of interfaces like Collection,Set,List or Map all the classes (ArrayList,LinkedList,Vector,etc) that implement these interfaces have some common set of methods.
  
2. Reduce progarmming effort :
   - A programmer doesn't have to worry about the design of Collection but rather than he can focus on it's best use in his program.
   - Therefore the basic concept of OOPs abstraction has been successfully implemented.
  
3. Increase program speed and quality :
   - Increase the performance by providing high performance implementations of useful data structures and algorithms.

#### Hierarchy Of the collection Framework
- java.util package contains all the classes and interface that are required by the collection.
- Itrable -> 
            Collection ->
                          List
                          Queue
                          Set    


#### Methods of the Collection Interface

| Method                     | Description                                                                                                                                                      |
| -------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| add(Object)                | This method is used to add an object to the collection                                                                                                           |
| addAll(Collection c)       | This method add all the elements in the given collection to this collection.                                                                                     |
| clear()                    | This method removes all the elements from this collection.                                                                                                       |
| contains(Object o)         | This method returns true if the collection contains the specified element.                                                                                       |
| containsAll(Collection c)  | This method returns true it the collection contains all of the elements in the given collection.                                                                 |
| hashCode()                 | This method is used to return the hash code value for this collection.                                                                                           |
| isEmpty()                  | This method returns true if this collection contains no element                                                                                                  |
| iterator()                 | This method returns an iterator over the elements in this collection.                                                                                            |
| max()                      | This method is used to return the maximum value present in the collection.                                                                                       |
| parallelStream()           | This method returns a parallel Stream with this collection as it's source.                                                                                       |
| remove(Object o)           | This method is used to remove the given object from the collection. If there are duplicate values, then this method removes the first occurrenece of the object. |
| removeAll(Collection c)    | This method is used to remove all the objects mentioned in the given collection from the collection.                                                             |
| removeIf(Predicate filter) | This method is used to remove all elements of this collection that satisfy the given predicate.                                                                  |
| retainAll(Collection c)    | This method is used to retain only the elements in this collection that are contained in the specified collection.                                               |
| size()                     | This method is used to return the number of elements in the collection.                                                                                          |
| spliterator()              | This method is used to create a Spliterator over the elements in this collection.                                                                                |
| stream()                   | This method is used to return a sequential stream with this collection as its source.                                                                            |
| to Array()                 | This method is used to return an array containing all the elements in this collection.                                                                           |
|                            |


#### Interfaces in collection 
**1. Iterable Interface:**
- This is the root interface for the entire collection framework.
- Collection interface extendes iterable interace. Therefore, inherently, all the interfaces and classes implement this interface.
- The main functionality of this interface is to provide an iterator for the collection.
- Iterable interface contains only one abstarct method which is iterator.
- It returns the Iterator iterator();

**2. Collection Interface :**
- This interafce is extendes Iterable interface and it's implemented all the classes in the collection framework.
- Collection interface contains basic universal methods like add(), remove()
- This interface acts like foundation on which collection classes implemented.

**3. List Interface :**
- This is a child interface of the collection interface.
- This interface insertion order of data is mainteined.
- This also allows duplicate data to be present in it.
- This List interface is implemented by various classes like ArrayList, LinkedList, Vector etc.
  
```
List<T> al = new ArrayList<>();
List<T> ll = new LinkedList<>();
List<T> v =  new Vector<>();

where T is the type of the object
```
**The classes which implements the List Interfaces :**
1] ArrayList :
- ArrayList provides us with dynamic dynamic arrays in java.
- It is slower than standered arrays but helpful programmers where lots of manipulation in the array is needed.
- The size of ArrayList is increases automaticaaly if the collection grows or shrinks if objects are removed from the collection.
- ArrayList allows us to randomly access the list because the array works on an index basis.
- ArrayList can not be used for primitive types like int, char etc. We need wrapper class for such cases.
- ArrayList class is non synchronized.
- In ArrayList, manipulation is a little bit slower than the LinkedList in java becuase a lot of shifting needs to occur if any element is removed from the array list.

```
import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            al.add(i);
        }

        System.out.println(al);

        al.remove(3);

        System.out.println(al);

        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        for (int int_value : al) {
            System.out.print(int_value + " ");
        }

    }
}
```

2] LinkList :
- Java LinkedList class uses a doubly linked list to store the elements.
- It provides a linked list data structure.
- It inherites the AbstractSequentialList class and implements List and Deque interface.
- LinkedList class can contain duplicate elements.
- LinkedList class maintain insertion order.
- LinkedList class is non synchronized.
- In java LinkedList class, manipulation is fast becuase no shifting needs to occur.
- Java LinkedList class can be used as list, stack or queue.

```
package programs;

import java.util.LinkedList;

public class ExampleLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for (int i = 1; i <= 5; i++) {
            ll.add(i);
        }

        System.out.println(ll);
        ll.remove(3);

        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }

        System.out.println();

        for (Integer integer : ll) {
            System.out.print(integer + " ");
        }

    }
}
```
**Difference between ArrayList and LinkList**

| ArrayList                                                                                                                                                    | LinkedList                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------- |
| ArrayList internally uses a dynamic array to store the elements.                                                                                             | LinkedList internally uses a doubly linked list to store the elements.                                                                |
| Manipulation with ArrayList is slow becuase it internally uses an array. If any element is removed from array, all the other elements are shifted in memory. | Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory. |
| An ArrayList class can act as a list only becuase it implements List only.                                                                                   | LinkedList class can act as list and queue both because it implements List and Deque interfaces.                                      |
| ArrayList is better for storing and accessing data.                                                                                                          | LinkedList is better for manipulating data.                                                                                           |
| The memory location for the elements of an ArrayList is contiguous                                                                                           | The memory location for the elements of a linked list is not contiguous.                                                              |
| Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList.                                                          | There is no case of default capacity in a LinkedList. In LinkedList, an empty list is created when a LinkedList is initialised.       |


**Points to Remember :**
- i) When  the rate of addition or rate of removal is more than the read then such a scenarios, we go for LinkedList. On the other hand, the frequency of the read scenarious is more than the addition or removal rate, then we go for ArrayList.
- ii) Since the elements of an ArrayList are stored more compact as compared to a LinkedList, therefore the ArrayList is more cache-friendly as compared to LinkedList. Thus, chance for the cache miss are less in an ArrayList as compared to LinkedList. Generally, it is considered that a LinkedList is poor in cache-locality.
- iii) Memory overhead in the LinkedList is more as compared to the ArrayList. It is becuase in a LinkedList we have two extra links (next and previous) as it required to store the address of the previous and the next nodes, and these links consume extra space. Such links are not present in an ArrayList.

3] Vector :
- Vector is like dynamic array which can grow or shrink it's size. (slower than standerd Array)
- Unlike Array there is no size limit we can store n numbers of elements in Vector.
- It is in util package (since JDK 1.2) and implements the List interface.
- The primary difference between a Vector and ArrayList is that a Vector is synchronized and an ArrayList is non-synchronized.
- It is recommended to use the Vector class in the thread-safe implementation only. If you don't need to use thread-safe implementation, you should use the ArrayList, the ArrayList will perform better in such case.

```
package programs;

import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();

        for (int i = 1; i <= 5; i++) {
            v.add(i);
        }

        System.out.println(v);

        v.remove(3);

        System.out.println(v);

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }

        System.out.println();

        for (Integer integer : v) {
            System.out.print(integer + " ");
        }
    }
}
```

**Difference Between ArrayList and Vector :**
| ArrayList                                                                                       | Vector                                                                                                                                                                                                      |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ArryList is not synchronized (Not Thread safe)                                                  | Vector is synchronized (Thread safe)                                                                                                                                                                        |
| ArrayList increments 50% of current array size if number of elements exceed from it's capacity. | Vector increments 100% the array size if the total number of elements exceed than it's capacity.                                                                                                            |
| ArrayList is not a legacy class. (Since JDK 1.2)                                                | Vector is a legacy class.                                                                                                                                                                                   |
| ArrayList is fast because it is non-synchronised.                                               | Vector is slow because it is synchronised. i.e. In a multi threading environment, it holds the other threads in runnable or non-runnable state until current thread releases the lock of the of the object. |


4] Stack :
- Stack class provides the stack data structure. 
- The class is based on basic principle of last-in-first out.
- Stack class extendes the Vector class.
- In addition to the basic push and pop operations, the class provides three more functions of empty,search and peek.
**Points to Remember :**
- Stack class is a subclass of Vector and a legacy class.
- It is thread-safe which might be overhead in an enviroment where thread safety is not needed.
- An alternate to Stack is to use <u>ArrayDequeue</u> which is not thread-safe and faster array implementation.

```
package programs;

import java.util.Iterator;
import java.util.Stack;

public class ExampleStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Indrajit");
        stack.push("Rajesh");
        stack.push("Rananavare");
        stack.push("Maharashtra");

        Iterator<String> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }

        System.out.println();

        for (String str : stack) {
            System.out.print(str + " ");
        }

        System.out.println(stack.peek());
    }
}

```

**4. Queue Interface :** 
- As the name suggest, a queue interface maintains the FIFO (First In First Out) oorder similar to a real-world queue line.
- This interface is dedicated to storing all the elements where the order of the elements matter. 
- For example, whenever we try to book a ticket, the tickets are sold on first come first serve basis. Therefore, the person whose request arrives first into the queue gets the ticket.
- There are various classes like <u>PriorityQueue,ArrayDeque</u>etc. which are implemented to Queue interface.
- We can instantiate a queue object with any of these class. For example,

```
Queue<T> pq = new PriorityQueue<>();
Queue<T> ad = new ArrayDeque<>();

where T is the type of the object.
```

1] Priority Queue :  
- A PriorityQueue is used when the objects are supposed to be processed based on the priority.
- We know that a queue follows the First-In-First-Out algorithm, but sometimes the elements of queue are needed to be processed according to the priority and this class is used in these cases.
- The PriorityQueue is based on the priority heap.

```
package programs;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ExamplePQueueInteger {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(7);

        Iterator<Integer> qValue = pQueue.iterator();

        while (qValue.hasNext()) {
            System.out.print(qValue.next() + " ");
        }

        System.out.println();

        System.out.println(pQueue.peek());

        System.out.println(pQueue.poll());

        for (Integer integer : pQueue) {
            System.out.print(integer + " ");
        }

        System.out.println();
        System.out.println(pQueue.peek());
    }
}

```

- The elementsof the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.

##### Comparable Inteface
- A comparable interface is used to order the objects of the user defined class.
- This interface is found in java.lang package
- Comparable interface contains only one method named comapredTo(Object).
- It provides a single sorting sequence only. i.e. You can sort the elements on the basis of single data member only.
- It modifies the actual class.

##### Comparator Interface 
- A comparator interface is used to order the objects of user-defined classes.
- This interface is found in java.util package 
- Comparator contains two methods compare(Object 1,Object 2) and equals(Object element).
- It provides multiple(one or more than one) sorting sequence. i.e. you can sort the elements on the basis of any data member, for example rollno,name,age or anything else.
- It does not modifies the actual class.

**Collections class :**
- Collection class provides static methods for sorting the elements of a collection.
- If collection elements are of Set or Map we can use TreeSet or TreeMap.
- However , we can not sort the elements of List, but Collections class provides methods for sorting the elements of List type elements also.

**Colletions.sort(List list, Comparator c)**
- Internally the sort method call Comparator method to sort the elements which returns 0 (for equal), 1 (for grater than), -1 (for less than)

**Comparable Example :**
```
package programs;

public class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        return (age == student.age) ? 0 : (age > student.age) ? 1 : -1;
    }

}


package programs;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleComparableInc {
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<Student>();

        listStudent.add(new Student(1001, "Vishal", 23));
        listStudent.add(new Student(1006, "Ramesh", 27));
        listStudent.add(new Student(1005, "Kiran", 21));

        Collections.sort(listStudent);

        for (Student st : listStudent) {
            System.out.println(st.rollNo + " " + st.name + " " + st.age);
        }

    }
}
```

**Comparator Example**
```
package programs;

public class Employee {
    int empId;
    String empName;
    int empSal;

    Employee(int empId, String empName, int empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }
}

```
```
package programs;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.empName.compareTo(emp2.empName);
    }

}

```
```
package programs;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return (emp1.empSal == emp2.empSal) ? 0 : (emp1.empSal > emp2.empSal) ? 1 : -1;

    }

}

```
```
package programs;

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

```
#### Difference between Comparable and Comparator Interfaces:
| **Comparable**                                                                                                                                            | **Comparator**                                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1) Comparable provides a single sorting sequence. In other words, we can sort the collection on the basis of a single element such as id, name and price. | Comparator provides a multiple sorting sequence. In other words, we can sort the collection on the basis of a multiple element such as id, name and price. |
| 2) Comparable affects the original class. i.e. The actual class is modified.                                                                              | Comparator does not affect the original class. i.e. The actual class is not modified.                                                                      |
| 3) Comparable provides compareTo() method to sort the elements                                                                                            | Comparator provides compare() method to sort the elements                                                                                                  |
| 4) Comparable is present java.lang package.                                                                                                               | Comparator is present java.util package.                                                                                                                   |
| 5) For sorting the elements using Comparable, Collection.sort(List) method is used.                                                                       | For sorting the elements using Comparator, Collection.sort(List,Comparator) method is used.                                                                |

<br>

**5. Deque Interface :**
- Deque interface is present in java.util package.
- It is the exteends the interface Queue.
- The Deque supports the addition as well as the removal of elements from both ends of the data structure.
- Therefore a Deque can be used as a stack or queue.
- We know that the stack supports the Last in First Out / First in Last Out (LIFO/FILO) and queue supports First in First Out (FIFO)
- So Deque supports both. It is double ended queue.

1] ArrayDeque :
- ArrayDeque is the class which implements Deque interface.
- Unlike Queue, we can add or remove elements from both sides.
- Null elements are not allowed in the ArrayDeque.
- ArrayDeque is not thread safe, in the absence of external synchronization.
- ArrayDeque has no capacity restrictions.
- ArrayDeque is faster than  LinkedList and Stack.

```
Deque <T> ad = new ArrayDeque<>();

where T is the type of the object 
```
```
package programs;

import java.util.ArrayDeque;

public class ExampleArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> aDeque = new ArrayDeque<Integer>();

        aDeque.add(10);
        aDeque.add(20);
        aDeque.add(30);
        aDeque.add(40);
        aDeque.add(50);

        System.out.println(aDeque);

        aDeque.clear();

        aDeque.addFirst(664);
        aDeque.addFirst(978);

        aDeque.addLast(32);
        aDeque.addLast(13);

        System.out.println(aDeque);
    }
}

```

**6. Set Interface :**
- This is a child interface of the collection interface.
- This interface insertion order of data is not mainteined.
- This does not allows duplicate data to be present in it.
- This List interface is implemented by various classes like HashSet, TreeSet, LinkedHashSet etc.
  
```
Set<T> hs = new HashSet<>();
Set<T> ts = new TreeSet<>();
Set<T> lhs = new LinkedHashSet<>();

where T is the type of the object
```

#### Difference Between List and Set**

| **List**                                                                         | **Set**                                                                                                |
| -------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------ |
| 1) The List implementation allow us to add the same or duplicate elements.       | The Set implementation does not allow us add same or duplicate element. It's contains unique elements. |
| 2) The insertion order is maintained by the List                                 | It does not maintain the insertion order of elements.                                                  |
| 3) List allow us to add any number of null values.                               | Set allow us to add at least one null value in it.                                                     |
| 4) The List implementation classes are LinkedList and ArrayList                  | The Set implementation classes are TreeSet, HashSet and LinkedHashSet.                                 |
| 5) We can get the element of a specified index from the list using get() method. | We can not find the element from the Set based on index because it does not provide any get method().  |
| 6) It is used when we want to frequently access the elements by using index.     | It is used when we want to design a collection of distinct elements.                                   |

<br>

1] HashSet :
- The HashSet class is provides hash table data structure.
- It extendes AbstarctSet class and implementes Set interface.
- For store the elements it using <ul>hashing</ul> mechanism.
- HashSet does not maintain the insertion order. Here the elements are inserted on the basis of their hashcode.
- HashSet contains unique elements only.
- HashSet allows null value.
- HashSet is non synchronized.
- HashSet is the best approach for search operations.
- The initial default capacity of HashSet is 16, and load factor is 0.75

```
package programs;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleHashSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("India");
        hs.add("is");
        hs.add("my");
        hs.add("country");
        hs.add("I");
        hs.add("love");
        hs.add("my");
        hs.add("country");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
```

2] LinkedHashSet :
- LinkedHashSet class provides Hashtable and Linked list implementation of Set interface.
- It extendes the HashSet class and implements the Set interface.
- LinkedHashSet class contains unique elements like HashSet.
- LinkedHashSet allows null value.
- It is non-synchronized.
- LinkedHashSet class maintains insertion order.

**Note :**
- Keeping the insertion order in the LinkedHashSet has some additional costs, both in terms of extra memory and extra CPU cycles. Therefore, if it is not required to maintain insertion order, go for the lighter-weight HashMap or the HashSet.

```
package programs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("India");
        lhs.add("is");
        lhs.add("my");
        lhs.add("country");
        lhs.add("I");
        lhs.add("love");
        lhs.add("my");
        lhs.add("country");

        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

```

**7. Sorted Set Interface :**
- This interface is very similar to Set interface. The only difference is that this interface has extra methods that maintain the ordering of the elements.
- The Sorted set interface extends the set interface and is used to handle the data which need to be sorted.
- The class which implements this interface is TreeSet.

```
SortedSet<T> ts = new TreeSet<>();

where T is the type of the object.
```

1] TreeSet :
- TreeSet extendes AbstractSet class and implements the NavigableSet interface. (The NavigableSet interface implements SortedSet)
- TreeSet class contains unique elements like HashSet.
- For TreeSet class access and retrivel times are quite fast.
- TreeSet does not allow the null element.
- TreeSet is non synchronized.
- TreeSet class maintain ascending order.
- It's internally implemented binary search tree.
- For synchronization of TreeSet use <u>Collections.synchronizedSet()</u>

```
package programs;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSetString {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Rakesh");
        ts.add("Vijay");
        ts.add("Rakesh");
        ts.add("Anjani");

        System.out.println();
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        for (String value : ts) {
            System.out.println(value);
        }

    }
}

```
```
import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSetInteger {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(34);
        ts.add(77);
        ts.add(12);
        ts.add(18);

        Iterator<Integer> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Lowest Value :" + ts.pollFirst());
        System.out.println("Highest Value :" + ts.pollLast());
    }
}

```