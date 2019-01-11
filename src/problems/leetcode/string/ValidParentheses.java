package problems.leetcode.string;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                Character match = null;
                switch (s.charAt(i)) {
                    case ')':
                        match = '(';
                        break;
                    case ']':
                        match = '[';
                        break;
                    case '}':
                        match = '{';
                        break;
                    default:
                        System.out.println("error");
                        break;
                }

                if (stack.size() == 0) {
                    return false;
                }

                Character c = stack.pop();
                if (!c.equals(match)) {
                    return false;
                }
            }
        }
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "{(([)))}";
        System.out.println(new ValidParentheses().isValid(s));
    }
}
