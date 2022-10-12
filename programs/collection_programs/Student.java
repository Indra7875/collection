package programs.collection_programs;

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
