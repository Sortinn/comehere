package problems.leetcode.main;

import java.util.Scanner;

public class Main8 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] num = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2};
    for (int i = 0; i < num.length; ) {
      System.out.print(num[i++]);
      System.out.print(" ");
      System.out.println(num[i++]);
    }
  }
}
