package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;

public class Day12_3Count {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        marks.add(20);
        marks.add(25);
        System.out.println(marks);

        long noOfFailedStudents = marks.stream()
                .filter(m -> m < 35)
                .count();

        System.out.println("Number of failed students are " + noOfFailedStudents);

    }
}
