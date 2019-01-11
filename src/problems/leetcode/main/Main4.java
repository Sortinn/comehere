package problems.leetcode.main;

import java.util.Scanner;

public class Main4 {


    public static int findPos(int[] nums, int pos) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > pos) {
                hi = mid - 1;
            } else if (nums[mid] < pos) {
                lo = mid + 1;
            } else {
                int i = mid;
                for (; i < nums.length; i++) {
                    if (nums[i] != nums[mid]) {
                        break;
                    }
                }
                return i - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        /* code */
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int pos = input.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(Main4.findPos(nums, pos));
    }
}
