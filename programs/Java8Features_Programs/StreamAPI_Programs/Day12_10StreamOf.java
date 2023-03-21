package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.stream.Stream;

public class Day12_10StreamOf {
     public static void main(String[] args) {
          Stream.of("Geeks").forEach(System.out::println);

          Stream.of(9, 99, 999, 9999, 99999).forEach(System.out::println);

     }

}
