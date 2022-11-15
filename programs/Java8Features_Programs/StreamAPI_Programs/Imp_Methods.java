package programs.Java8Features_Programs.StreamAPI_Programs;

import java.util.List;

public class Imp_Methods {
    public static void main(String[] args) {

        /*
            filter(takes Predicate values which return TRUE/FALSE)
            boolean value function
            e -> e > 10
        */

        /*
            map (takes function which return value)
            each element operation
         */

        List <String> nameList = List.of("Amar","Ankit","Aniket","Ram","Sham","Abhi");
        nameList.stream().filter(e-> e.startsWith("A"))
                .forEach(e -> System.out.println(e));

        List <Integer> num_List = List.of(1,2,3,4,5,6,7,8,9,10);
        num_List.stream().map(i -> i*i)
                .forEach(i -> System.out.println(i));

       int minNum = num_List.stream()
               .min((x,y) -> x.compareTo(y))
               .get();
       System.out.println("Minimum number from list is "+ minNum);

       int maxNum = num_List.stream()
               .max((x,y) -> x.compareTo(y))
               .get();
        System.out.println("Maximum number from list is "+ maxNum);

    }
}
