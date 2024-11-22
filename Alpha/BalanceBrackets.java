package Alpha;
/*
Piramil Finance

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
        An input string is valid if:
        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.

        Example 1:
        Input: s = "()"
        Output: true
        Example 2:
        Input: s = "()[]{}"
        Output: true
        Example 3:
        Input: s = "(]"
        Output: false
        Example 4:
        Input: s = "([])"
        Output: true

        Constraints:
        1 <= s.length <= 104
        s consists of parentheses only '()[]{}'.
*/


import java.util.Stack;

public class BalanceBrackets {

            public static void main(String[] args) {

                String str = "(){}[]())";

                Stack<Character> stk = new Stack<>();

                for(int i = 0; i<str.length();i++){

                    if(str.charAt(i)=='(' || str.charAt(i)=='{' ||str.charAt(i)=='['){
                        stk.push(str.charAt(i));
                    }
                    else{
                        if(!stk.empty() && ((stk.peek()=='(' && str.charAt(i) == ')') ||
                                (stk.peek()=='{' && str.charAt(i) == '}') ||
                                (stk.peek()=='[' && str.charAt(i) == ']'))){
                            stk.pop();
                        }else{
                            System.out.println("false");
                            return;
                        }

                    }

                }

                System.out.println(stk.empty());

            }





}
