package programs.collection_programs;

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