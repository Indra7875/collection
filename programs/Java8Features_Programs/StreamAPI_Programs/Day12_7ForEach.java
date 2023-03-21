package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Day12_7ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        System.out.println(list);

        list.stream().forEach(System.out::println);

        Consumer<Integer> c = i -> {
            System.out.println("The Square of " + i + " is : " + (i * i));
        };
        list.stream().forEach(c);

        list.stream().forEach(i -> {
            System.out.println("The Cube of " + i + " is : " + (i * i * i));
        });
    }
}
