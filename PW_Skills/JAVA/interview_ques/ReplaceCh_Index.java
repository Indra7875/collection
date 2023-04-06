package interview_ques;

// Replace a character at a specific index in a String in java
public class ReplaceCh_Index {
    public static void main(String[] args) {
        String str = "Eelcome to java";
        int index =0;
        char ch = 'W';

        StringBuilder builder = new StringBuilder(str);
        builder.setCharAt(index,ch);
        System.out.println(builder);
    }
}
