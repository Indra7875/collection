package DS_AND_ALGO;

// Que. Given a string, the task is check whether given string is palindrome or not.
public class StringPalindrome1 {
    public static void main(String[] args) {
        String name = "madam";
        boolean result = isPalindrome(name);
        if (result)
            System.out.println("Given string " + name + " is palindrome");
        else
            System.out.println("Given string " + name + " is not palindrome");
    }

    public static boolean isPalindrome(String name) {
        String reverseStr = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseStr += name.charAt(i);
        }
        return reverseStr.equals(name);
    }
}
