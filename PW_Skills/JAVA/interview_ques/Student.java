package interview_ques;

public class Student {
    private int age;
    private String name;
    private String subject;

    public Student(int age, String name, String subject) {
        this.age = age;
        this.name = name;
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

}
