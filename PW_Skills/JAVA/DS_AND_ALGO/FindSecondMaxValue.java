package DS_AND_ALGO;

public class FindSecondMaxValue {
    public static void main(String[] args) {
        int[] intArray = { 13, 34, 2, 34, 33, 1 };
        int result = findSecondMaxValue(intArray);
        if (result == 0)
            System.out.println("All values in an array are equal so second max value is not present in an array");
        else
            System.out.println("Second max value = " + result);
    }

    public static int findSecondMaxValue(int[] intArray) {
        int maxValue = intArray[0];
        int secondMaxValue = 0;
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == maxValue)
                count++;
        }
        if (count == intArray.length)
            return secondMaxValue;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > maxValue) {
                secondMaxValue = maxValue;
                maxValue = intArray[i];
            } else if (intArray[i] > secondMaxValue && intArray[i] != maxValue) {
                secondMaxValue = intArray[i];
            }
        }
        return secondMaxValue;
    }
}
