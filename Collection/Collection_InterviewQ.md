**Que 1) Why Map does not extends collection interface ?**
- The Map interface in java follows key-value pair structure whereas in Collection interface follow objects which are stored in a structured manner with specified access mechanism.
- Collection interface having add(E e) method which does not supports to Map interface, In Map we have put(key,value) method.

**Que 2) What is difference between fail fast and fail safe Iterators ?**
- Fail Fast iterator throws ConcurrentModificationException.
- When one thread is iterating over collection objects other thread structurally modifies the collection either by adding, removing or modifying objects on underlying collection.
- They are called fail fast because they try to immediately throws exception when they encounter failure.

- Fail Safe iterator does not throws any exception because they work on cone of collection instead of original collection.
- That's why they are called fail safe iterator.

**Que 3) What is Thread Safe in Java**