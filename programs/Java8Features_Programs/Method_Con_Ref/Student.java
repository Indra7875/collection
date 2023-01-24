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
