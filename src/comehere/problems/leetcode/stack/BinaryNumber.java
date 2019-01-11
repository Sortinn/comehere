package comehere.problems.leetcode.stack;

import java.util.Stack;

public class BinaryNumber {

  public static void binaryNumber(int num) {
    Stack<Integer> stack = new Stack<>();
    while (num > 0) {
      stack.push(num % 2);
      num /= 2;
    }

    while (!stack.isEmpty()) {
      System.out.print(stack.pop());
    }
  }


  public static void main(String[] args) {
    binaryNumber(Integer.MAX_VALUE);
    System.out.println();
    System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
  }
}
