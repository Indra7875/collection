package programs.Generics;

import java.util.ArrayList;
import java.util.List;

public class CompileTimeCheck_Generic {
    public static void main(String[] args) {
        // using generic
        List<String> list = new ArrayList<String>();
        list.add("hello");
        // list.add(100); compile time error
        System.out.println(list);
    }
}
