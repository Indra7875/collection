package DS_AND_ALGO;

public class MissingNumUsingFormula {
    public static void main(String[] args) {
        int[] intArray = { 2, 4, 1, 8, 6, 3, 7 };
        int missingNumber = missingNum(intArray);
        System.out.println("Missing Number is " + missingNumber);
    }

    public static int missingNum(int[] intArray) {
        int n = intArray.length + 1;
        int requiredSum = n * (n + 1) / 2;

        for (int i : intArray) {
            requiredSum -= i;
        }
        return requiredSum;
    }
}
