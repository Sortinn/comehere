package problems.leetcode.stack;

import java.util.Scanner;
import java.util.Stack;

public class EvaluateReversePolishNotation {


    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int second = Integer.parseInt(stack.pop());
                int first = Integer.parseInt(stack.pop());
                int resMid;
                if (tokens[i].equals("+")) {
                    resMid = first + second;
                } else if (tokens[i].equals("-")) {
                    resMid = first - second;
                } else if (tokens[i].equals("*")) {
                    resMid = first * second;
                } else {
                    resMid = first / second;
                }
                String s = resMid + "";
                stack.push(s);
            } else {
                stack.push(tokens[i]);
            }
        }
        return Integer.parseInt(stack.peek());

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        String[] token = in.split(" ");
        System.out.println(new EvaluateReversePolishNotation().evalRPN(token));
    }
}
