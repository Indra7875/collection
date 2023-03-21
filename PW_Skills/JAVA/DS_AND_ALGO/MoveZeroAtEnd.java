// Move all zero's at end while mainain relative order of the non-zero elements 
package DS_AND_ALGO;

public class MoveZeroAtEnd {
    public static void main(String[] args) {
        int[] intArray = { 8, 1, 2, 0, 1, 0, 3 };
        printArray(moveZeroAtEnd(intArray));

    }

    public static int[] moveZeroAtEnd(int[] intArray) {
        int j = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != 0 && intArray[j] == 0) {
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
            if (intArray[j] != 0) {
                j++;
            }
        }
        return intArray;
    }

    public static void printArray(int[] intArray) {
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
