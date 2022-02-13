package validparentheses;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("0");
        stack.push("1");
        stack.push("2");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack.pop());

        stack.peek();

        System.out.println(stack);
        System.out.println(stack.peek());

    }
}
