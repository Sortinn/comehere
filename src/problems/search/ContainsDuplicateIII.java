package problems.search;

import java.util.TreeSet;

public class ContainsDuplicateIII {
    /**
     * 给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值最大为 t，并且 i 和 j 之间的差的绝对值最大为 ķ。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [1,2,3,1], k = 3, t = 0
     * 输出: true
     * 示例 2:
     * <p>
     * 输入: nums = [1,0,1,1], k = 1, t = 2
     * 输出: true
     * 示例 3:
     * <p>
     * 输入: nums = [1,5,9,1,5,9], k = 2, t = 3
     * 输出: false
     */

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();

        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {

            Long floor = set.floor((long) (nums[i] + t));
            Long ceiling = set.ceiling((long) (nums[i] - t));
            if ((floor != null && nums[i] <= floor) || (ceiling != null && nums[i] >= ceiling) ) {
                return true;
            }

            set.add((long) nums[i]);
            if (set.size() >= k) {
                set.remove((long)nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateIII containsDuplicateIII = new ContainsDuplicateIII();
        Boolean res = containsDuplicateIII.containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 0}, 3, 0);
        System.out.println(res);
    }
}

