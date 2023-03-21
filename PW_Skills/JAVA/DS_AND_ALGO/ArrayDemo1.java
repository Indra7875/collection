package DS_AND_ALGO;

public class ArrayDemo1 {

    public void insertArrayDemo() {
        int[] myArray = new int[5];
        printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 9;
        printArray(myArray);
        System.out.println("Length of array = " + myArray.length);
    }

    public void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayDemo1 arrayDemo1 = new ArrayDemo1();
        arrayDemo1.insertArrayDemo();
    }
}
