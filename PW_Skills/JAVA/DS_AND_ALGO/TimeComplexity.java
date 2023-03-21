package DS_AND_ALGO;

public class TimeComplexity {
    public static void main(String[] args) {
        double currentSystemTime = System.currentTimeMillis();

        TimeComplexity timeComplexity = new TimeComplexity();
        System.out.println("Sum of 5555555 Natural numbers = " + timeComplexity.findSum(5555555));

        double afterCodeRunSystemTime = System.currentTimeMillis();

        System.out.println("Time taken = " + (afterCodeRunSystemTime - currentSystemTime) + "milliseconds");

    }

    // Ramesh Algortihm
    private int findSum(int n) {
        return n * (n + 1) / 2;
    }

    // Suresh Algorithm

    // private int findSum(int n) {
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    // sum = sum + i;
    // }
    // return sum;
    // }
}
