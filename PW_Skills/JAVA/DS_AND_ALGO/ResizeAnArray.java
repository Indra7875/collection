package DS_AND_ALGO;

public class ResizeAnArray {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 3, 10 };
        printArray(arr);
        int[] resizedArray = resizeArray(arr, arr.length * 2);
        printArray(resizedArray);
    }

    public static int[] resizeArray(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void printArray(int[] resizedArray) {
        for (int i : resizedArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
