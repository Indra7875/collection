package interview_ques;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacci(10);
    }

    public static void fibonacci(int n) {
        if (n == 0) {
            System.out.println("0");
        } else {
            int a = 0;
            int b = 1;
            int c = 0;
            System.out.println("0");
            System.out.println("1");
            for (int i = 2; i < n; i++) {
                c = a + b;
                System.out.print(a + " + " + b);
                a = b;
                b = c;
                System.out.println(" = " + b);
            }

        }
    }
}
