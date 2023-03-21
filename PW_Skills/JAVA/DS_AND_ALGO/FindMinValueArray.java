package DS_AND_ALGO;

public class FindMinValueArray {
    public static void main(String[] args) {
        int[] intArray = { 5, 9, 3, 15, 1, 2 };
        System.out.println("Minimum value in array is " + findMinValue(intArray));
    }

    public static int findMinValue(int[] intArray) {
        int minValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < minValue)
                minValue = intArray[i];
        }
        return minValue;
    }
}
