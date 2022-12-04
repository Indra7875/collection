package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        String[] names = {"Indrajit","Ram","Vishal","Vivek","Divya","Aniket","Uttam"};

        Stream<String> namesStream = Stream.of(names);
        namesStream.forEach(e -> {
            System.out.println(e);
        });
    }
}
