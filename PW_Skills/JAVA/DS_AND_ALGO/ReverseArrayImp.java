package DS_AND_ALGO;

public class ReverseArrayImp {
    public static void main(String[] args) {
        int[] resultArray = reverseArray(new int[] { 2, 11, 5, 10, 7, 8 });
        printArray(resultArray);
    }

    public static int[] reverseArray(int[] intArray) {
        int startIndex = 0;
        int lastIndex = intArray.length - 1;
        int temp = 0;

        while (startIndex < lastIndex) {
            temp = intArray[startIndex];
            intArray[startIndex] = intArray[lastIndex];
            intArray[lastIndex] = temp;
            startIndex++;
            lastIndex--;
        }
        return intArray;
    }

    public static void printArray(int[] resultArray) {
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println();
    }
}
