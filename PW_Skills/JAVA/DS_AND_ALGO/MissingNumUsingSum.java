package DS_AND_ALGO;
// Que. Given an array of n-1 distinct numbers in the range of 1 to n. Find the missing number in it.

// Ans : [2,4,1,8,6,3,7] => index 0 to 6 => length 7 => staring from 1 to n (7) => It will equally occupies => but given 1 to 8 so one number is missing => take sum of 1 to array.length + 1 and subtract from sum of array[0] to array[last_index]

public class MissingNumUsingSum {
    public static void main(String[] args) {
        int[] intArray = { 2, 4, 1, 8, 6, 3, 7 };
        int missingNumber = missingNum(intArray);
        System.out.println("Missing Number is " + missingNumber);
    }

    public static int missingNum(int[] intArray) {
        int requiredSum = 0;
        int actualSum = 0;
        for (int i = 1; i <= intArray.length + 1; i++) {
            requiredSum += i;
        }

        for (int i = 0; i < intArray.length; i++) {
            actualSum += intArray[i];
        }

        return requiredSum - actualSum;
    }
}
