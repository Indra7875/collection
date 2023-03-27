package interview_ques;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DemoForStudent {
    public static void main(String[] args) {
        List<Student> studentList1 = new LinkedList<Student>();
        studentList1.add(new Student(29, "Pravas", "hindi"));
        studentList1.add(new Student(35, "Anjani", "History"));
        studentList1.add(new Student(23, "Vishal", "computer"));
        studentList1.add(new Student(32, "Varalu", "maths"));


        System.out.println("Before Sort By Name");
        studentList1.stream().forEach(s -> {
            System.out.println(s.getName());
        });

        System.out.println("After Sort By Name");
        Collections.sort(studentList1,new NameComparator());

        studentList1.stream().forEach(s->{
            System.out.println(s.getName());
        });

        System.out.println("Before Sort By Age");
        studentList1.stream().forEach(s->{
            System.out.println(s.getAge());
        });

        System.out.println("After Sort By Age");
        Collections.sort(studentList1,new AgeComparator());

        studentList1.stream().forEach(s->{
            System.out.println(s.getAge());
        });

        System.out.println("-----------------------------------------------------");

        List<Student> studentList2 = new LinkedList<Student>();
        studentList2.add(new Student(29, "Pravas", "hindi"));
        studentList2.add(new Student(35, "Anjani", "History"));
        studentList2.add(new Student(23, "Vishal", "computer"));
        studentList2.add(new Student(32, "Varalu", "maths"));


        System.out.println("Before Sort By Name");

        studentList2.stream().forEach(s->{
            System.out.println(s.getName());
        });

        System.out.println("After Sort By Name");

        studentList2.stream().sorted(new NameComparator()).forEach(s->{
            System.out.println(s.getName());
        });

        System.out.println("Before Sort By Age");

        studentList2.stream().forEach(s->{
            System.out.println(s.getAge());
        });

        System.out.println("After Sort By Age");

        studentList2.stream().sorted(new AgeComparator()).forEach(s->{
            System.out.println(s.getAge());
        });
    }
}
