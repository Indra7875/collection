package programs.Generics;

import java.util.ArrayList;
import java.util.List;

public class TypeSafe_Generics {
    public static void main(String[] args) {
        // without generics
        List list1 = new ArrayList();
        list1.add("ABC");
        list1.add(23.6f);
        list1.add(100);

        // with generics
        List<String> list2 = new ArrayList<String>();
        list2.add("ABC");
        // list2.add(23.6f); compile time error
        // list2.add(100); compile time error

        System.out.println("list1 " + list1 + "\nlist2 " + list2);
    }
}
