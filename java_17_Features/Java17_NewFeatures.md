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