package comehere.problems.leetcode.search;

import java.util.*;

public class TwoSum {


    public int[] twoSum_Onlogn(int[] nums, int target) {

        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();


        //O(n)
        for (int i = 0; i < nums.length; i++) {
            //O(1)
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            int halfPart = target - nums[i];
            if (map.containsKey(halfPart) && map.get(halfPart) != i) {
                int j = map.get(halfPart);
                return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public int[] twoSum_On2(int[] nums, int target) {
        int res[] = new int[2];
        if (nums.length <= 1) {
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}
