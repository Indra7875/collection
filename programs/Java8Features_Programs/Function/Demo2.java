package programs.Java8Features_Programs.Function;

import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {

        Function<Student,String> f = s -> {
         String grade = "";
         if(s.marks >= 80) grade = "A[Distinction]";
         else if(s.marks >= 60) grade = "B[First Class]";
         else if(s.marks >= 50) grade = "C[Second Class]";
         else if(s.marks >= 35) grade = "D[Third Class]";
         else grade = "Failed";
         return grade;
        };

        Student[] s = {
                new Student("Suresh",99),
                new Student("Ramesh",65),
                new Student("Vikas",55),
                new Student("Ram",45),
                new Student("Rocky",25)
        };

        for (Student s1 : s){
            System.out.println("Name of the student "+s1.name);
            System.out.println("Marks of student "+s1.marks);
            System.out.println("Grade of student "+f.apply(s1));
            System.out.println();
        }
    }
}
