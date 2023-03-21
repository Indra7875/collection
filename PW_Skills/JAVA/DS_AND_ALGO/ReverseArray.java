package DS_AND_ALGO;

public class ReverseArray {
    public static void main(String[] args) {
        int[] resultArray = reverseArray(new int[] { 2, 11, 5, 10, 7, 8 });
        printArray(resultArray);
    }

    public static int[] reverseArray(int[] intArray) {
        int[] resultArray = new int[intArray.length];
        int index = 0;
        for (int i = intArray.length - 1; i >= 0; i--) {
            resultArray[index] = intArray[i];
            index++;
        }
        return resultArray;
    }

    public static void printArray(int[] resultArray) {
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println();
    }
}
