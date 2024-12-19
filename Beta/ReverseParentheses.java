package Beta;

import java.util.Stack;

public class ReverseParentheses {
    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";
        System.out.println(reverseParentheses(s)); // Output: "leetcode"

        String s2 = "(le(te(co)de))";
        System.out.println(reverseParentheses(s2)); // Output: "edocetle"
    }

    public static String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                // Push the current string onto the stack
                stack.push(current);
                current = new StringBuilder();
            } else if (c == ')') {
                // Reverse the current string
                current.reverse();
                // Append to the last string popped from the stack
                current = stack.pop().append(current);
            } else {
                // Add character to the current string
                current.append(c);
            }
        }

        return current.toString();
    }
}
