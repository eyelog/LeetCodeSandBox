package validparentheses;


import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String a = "(()){{([)]}}";
        boolean result = isValid(a);
        System.out.println("Result is " + result);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
