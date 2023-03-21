package programs.Java8Features_Programs.StreamAPI_Programs;
// Que sort the given string by it's length and if the length is equal the sort it by alphabetically.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day12_4SortedString {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        listString.add("A");
        listString.add("AAAA");
        listString.add("AA");
        listString.add("BBB");
        listString.add("AAA");

        System.out.println(listString);

        Comparator<String> c = (s1, s2) -> {
            if (s1.length() < s2.length())
                return -1;
            else if (s1.length() > s2.length())
                return 1;
            else
                return s1.compareTo(s2);
        };

        List<String> sortedList = listString.stream()
                .sorted(c)
                .collect(Collectors.toList());

        System.out.println(sortedList);

    }
}
