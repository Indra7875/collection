package programs;

import java.util.Iterator;
import java.util.Stack;

public class ExampleStackString {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Indrajit");
        stack.push("Rajesh");
        stack.push("Rananavare");
        stack.push("Maharashtra");

        Iterator<String> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }

        System.out.println();

        for (String str : stack) {
            System.out.print(str + " ");
        }

        System.out.println(stack.peek());
    }
}
