package programs.Generics;

import java.util.ArrayList;
import java.util.List;

public class NoTypeCast_Generics {
    public static void main(String[] args) {
        // without generics
        List list1 = new ArrayList();
        list1.add("Hiii");
        String str1 = (String) list1.get(0); // type-casting is required
        System.out.println(str1);

        // with generics
        List<String> list2 = new ArrayList<String>();
        list2.add("Byeee");
        String str2 = list2.get(0); // type-casting is not required
        System.out.println(str2);

    }
}
