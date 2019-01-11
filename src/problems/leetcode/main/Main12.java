package problems.leetcode.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main12 {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String line = bf.readLine();
    String[] strings = line.split(" ");
    int[] nums = new int[strings.length];
    for (int i = 0; i < strings.length; i++) {
      nums[i] = Integer.parseInt(strings[i]);
    }
    System.out.println(res(nums));
  }

  private static int res(int[] nums) {
    int res = 0;
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i) {
        res = nums[i];
        break;
      }
    }
    return res;
  }
}
