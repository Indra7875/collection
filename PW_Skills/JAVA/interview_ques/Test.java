package interview_ques;

public class Test extends B implements I {
    String a = "from class A";

    public static void main(String[] args) {
        System.out.println(I.a);

        Test test = new Test();
        System.out.println(test.a);

        B b1 = new Test();
        System.out.println(b1.a);
    }
}