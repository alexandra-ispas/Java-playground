package hackerrank;

import java.util.Stack;

public class BalancedBracketsPair {

    public static boolean isBalanced(String s) {
        if(s.length() % 2 == 1) return false;   //guard

        Stack<Character> stack = new Stack<> ();

        for(int i = 0; i < s.length (); i++) {
            char ch = s.charAt ( i );
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push ( ch );
            } else {
                if(stack.isEmpty())
                    return false;
                if((ch == ')' && stack.peek () == '(') ||
                        (ch == ']' && stack.peek () == '[') ||
                        (ch == '}' && stack.peek () == '{')) {
                    stack.pop ();
                } else {
                    return false;
                }
            }
        }
        // if the stack is not empty, we haven't closed all brackets
        return stack.isEmpty ();
    }
}
