package interview_ques;

public class SwapTwoValues {
    public static void main(String[] args) {
        swapTwoValuesWith(10, 20);
        swapTwoValuesWithout(90, 80);
    }

    public static void swapTwoValuesWith(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
        int c = 0;
        c = a;
        a = b;
        b = c;

        System.out.println("a = " + a + " b = " + b);

    }

    public static void swapTwoValuesWithout(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);

    }
}
