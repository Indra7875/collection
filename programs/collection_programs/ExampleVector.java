package programs.collection_programs;

import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();

        for (int i = 1; i <= 5; i++) {
            v.add(i);
        }

        System.out.println(v);

        v.remove(3);

        System.out.println(v);

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }

        System.out.println();

        for (Integer integer : v) {
            System.out.print(integer + " ");
        }
    }
}