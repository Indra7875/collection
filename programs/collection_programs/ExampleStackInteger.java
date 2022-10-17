package programs.collection_programs;

import java.util.Iterator;
import java.util.Stack;

public class ExampleStackInteger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(15);
        stack.push(7);

        Iterator<Integer> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }

        System.out.println();

        for (Integer str : stack) {
            System.out.print(str + " ");
        }

        System.out.println(stack.peek());
    }
}
