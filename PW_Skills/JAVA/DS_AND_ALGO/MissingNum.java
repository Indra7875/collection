package DS_AND_ALGO;

public class MissingNum {
    public static void main(String[] args) {
        int[] numArray = { 2, 4, 1, 8, 6, 3, 7 };
        missingNum(numArray, numArray.length);
    }

    public static int missingNum(int[] numArray, int n) {
        int missedNum = 0;
        for (int i = 1; i < n; i++) {
            if (numArray[i] < numArray[0]) {
                int temp = numArray[i];
                numArray[i] = numArray[0];
                numArray[0] = temp;
            }
        }
        printArray(numArray);
        return 0;
    }

    public static void printArray(int[] numArray) {
        for (int i : numArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
