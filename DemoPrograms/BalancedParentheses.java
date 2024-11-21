package DemoPrograms;


import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String expression) {
        // Stack to keep track of opening parentheses
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char ch : expression.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check for matching closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Mismatched pair
                }
            }
        }

        // If stack is empty, all brackets were matched
        return stack.isEmpty();
    }

    // Helper function to check if a pair of brackets match
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String expression = "{[()]}"; // Test case
        if (isBalanced(expression)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }
    }
}
