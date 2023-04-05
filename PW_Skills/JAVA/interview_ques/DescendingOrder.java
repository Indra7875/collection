package interview_ques;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Que. How to sort an ArrayList in Descending Order in Java
public class DescendingOrder {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("AA","ZZ","CC","FF");

        strList.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
    }
}
