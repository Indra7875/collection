package DS_AND_ALGO;

public class ArrayDemo2 {
    public void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayDemo2 arrayDemo2 = new ArrayDemo2();
        arrayDemo2.printArray(new int[] { 5, 1, 2, 9, 10 });
    }
}
