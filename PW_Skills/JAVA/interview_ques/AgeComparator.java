package interview_ques;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAge() == s2.getAge() ? 0 : s1.getAge() > s2.getAge() ? 1 : -1;
    }
}
