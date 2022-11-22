package programs.Java8Features_Programs.Predicate;

import java.util.function.Predicate;

public class Demo2 {
    static Predicate<String> str = s -> s.length() > 6;  // Predicate can use as static/non-static
    public static void main(String[] args) {
        String [] names = {"Vijay","Lankeshwar","Mahamahim","Sukumar","Rushi","Chakravarti","Sam","Ajay"};
        for(String s : names){
            if(str.test(s)){
                System.out.println(s);
            }
        }
    }
}
