package programs.Java8Features_Programs.JavaTechie.map_reduce;

import java.util.Arrays;
import java.util.List;

// Write the program to find the longest stream using stream API
public class MapReduceExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("corejava","springboot","hibernate","spring","angular");

        String longString = words.stream().reduce((w1,w2) -> w1.length() > w2.length() ? w1 : w2).get();
        System.out.println(longString);

    }
}
