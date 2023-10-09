#### Optional 
- Optional is introduced in JDK 8.
- It is used to deal null object / null pointer exception.
- Optional class present in java.util package.
- There are three static methods present in Optional class empty(), of(T value), ofNullable(T value).
  i) empty() : To create Optional object / Return optional object.
  ii) of(T value) : It will check object is null or not. If it's null then throws null pointer exception else return same object.
  iii) ofNullable() : It is combination of empty() and of(T value) method. If object is null then execute empty() method else execute of(T value) method.