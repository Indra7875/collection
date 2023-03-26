#### Lambda Expression ----> Method OR Constructor Reference
```
package programs.Java8Features_Programs.Method_Con_Ref;

public class Demo1Thread {
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i=0; i<10;i++){
                System.out.println("Child Thread");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i=0; i<10;i++){
            System.out.println("Main Thread");
        }
    }
}

```

```
package programs.Java8Features_Programs.Method_Con_Ref;

public class Demo2Thread {
    public static void childThread(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread-1");
        }
    }

    public static void main(String[] args) {
        Runnable r = Demo2Thread::childThread; // static method
        Thread t = new Thread(r);
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread-1");
        }

    }
}

```
```
package programs.Java8Features_Programs.Method_Con_Ref;

public class Demo3Thread {
    public void childThread(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread-1");
        }
    }

    public static void main(String[] args) {
        Demo3Thread d3 = new Demo3Thread();

        Runnable r = d3::childThread; // instance method
        Thread t = new Thread(r);
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread-1");
        }

    }
}

```

- Advantage : Code Reusability 
- For Static Method > class_name::method_name
- For Non-static/instance Method > object_reference::method_name
- In Method/Constructor reference Method arguments should match. Different Modifier, return type is acceptable.

```
package programs.Java8Features_Programs.Method_Con_Ref;

public interface InterfaceDemo1 {
    public void add(int a, int b);
}


package programs.Java8Features_Programs.Method_Con_Ref;

public class Demo4 {
    public static void sum(int a, int b){
        System.out.println("The sum is : "+(a+b));
    }

    public static void main(String[] args) {
        InterfaceDemo1 interfaceDemo1 = (x,y) -> System.out.println("The sum is : "+(x+y));
        interfaceDemo1.add(10,20);

        InterfaceDemo1 interfaceDemo11 = Demo4::sum;
        interfaceDemo11.add(100,200);
    }
}

```

#### Constructor Reference :
- class_name::new

**When we go for constructor reference ?**
- If method is returning an object that case we can go for constructor reference.

```
package programs.Java8Features_Programs.Method_Con_Ref;

public interface InterfaceDemo2 {
    public Sample get();
}

package programs.Java8Features_Programs.Method_Con_Ref;

public class Sample {
    Sample(){
        System.out.println("Sample class Constructor Executed");
    }
}

package programs.Java8Features_Programs.Method_Con_Ref;

public class Demo5 {
    public static void main(String[] args) {
        InterfaceDemo2 interfaceDemo2 = Sample::new;
        interfaceDemo2.get();
        Sample s2 = interfaceDemo2.get();
    }
}

```
- Interface get() method refers a Sample class constructor.

**If method argument is there then compulsory Constructor argument should match with it**
**It will always take match constructor**
```
package programs.Java8Features_Programs.Method_Con_Ref;

public interface InterfaceDemo2 {

    public Sample get(String str);
}

package programs.Java8Features_Programs.Method_Con_Ref;

public class Sample {
    Sample(String str){
        System.out.println("Sample class Constructor Executed with Argument "+str);
    }
}

package programs.Java8Features_Programs.Method_Con_Ref;

public class Demo5 {
    public static void main(String[] args) {
        InterfaceDemo2 interfaceDemo2 = Sample::new;
        interfaceDemo2.get("Manoj");
        Sample s2 = interfaceDemo2.get("Ramesh");
    }
}

```

```
package programs.Java8Features_Programs.Method_Con_Ref;

public class Student {
    String name;
    int rollNo;
    int marks;
    int age;
    Student(String name, int rollNo, int marks, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.age = age;
        System.out.println("Name:"+name +" RollNo:"+rollNo+" Marks:"+marks+" Age:"+age);
    }

}

package programs.Java8Features_Programs.Method_Con_Ref;

public interface InterfaceDemo4 {
    public Student get(String name, int rollNo, int marks, int age);
}

package programs.Java8Features_Programs.Method_Con_Ref;

public class Test {
    public static void main(String[] args) {
        // Using Lambda Expression
        InterfaceDemo4 interfLambda = (name, rollNo, marks, age) -> new Student(name,rollNo,marks,age);
        // Using Method Reference
        InterfaceDemo4 interfRef = Student::new;

        interfLambda.get("Indrajit",01,87,25);
        interfRef.get("Kumar",02,98,25);
    }
}

```