package DS_AND_ALGO;

// Remove even Integers from array 
public class ArrayEvenRemove {
    public static void main(String[] args) {
        int[] intArray = { 3, 2, 4, 7, 10, 6, 5 };
        ArrayEvenRemove arrayEvenRemove = new ArrayEvenRemove();
        int[] oddIntArray = arrayEvenRemove.evenIntRemove(intArray);
        arrayEvenRemove.printArray(oddIntArray);
    }

    public int[] evenIntRemove(int[] intArray) {
        int countOdd = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                countOdd++;
            }
        }
        int[] oddIntArray = new int[countOdd];
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                oddIntArray[index] = intArray[i];
                index++;
            }
        }
        return oddIntArray;
    }

    public void printArray(int[] oddIntArray) {
        for (int i = 0; i < oddIntArray.length; i++) {
            System.out.print(oddIntArray[i] + " ");
        }
        System.out.println();
    }
}
