package DS_AND_ALGO;

public class StringPalindrome2 {
    public static void main(String[] args) {
        String name = "madam";
        if (isPalindrome(name))
            System.out.println("Given string " + name + " is palindrome");
        else
            System.out.println("Given string " + name + " is not palindrome");
    }

    public static boolean isPalindrome(String name) {
        int firstIndex = 0;
        int lastIndex = name.length() - 1;

        while (lastIndex > firstIndex) {
            if (name.charAt(firstIndex) != name.charAt(lastIndex))
                return false;

            firstIndex++;
            lastIndex--;
        }
        return true;
    }
}
