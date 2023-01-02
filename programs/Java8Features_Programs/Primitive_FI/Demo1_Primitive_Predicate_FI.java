package programs.Java8Features_Programs.Primitive_FI;

import java.util.function.IntPredicate;

public class Demo1_Primitive_Predicate_FI {
    public static void main(String[] args) {
        int [] values = {5,10,15,20,25,30,35,40,45,50};
        // IntPredicate
        IntPredicate check = i -> i%2 == 0;
        for (int i : values){
            if (check.test(i))
                System.out.println("Even value : "+i);
            else
                System.out.println("Odd value : "+i);
        }

    }
}
