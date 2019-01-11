package comehere.problems.leetcode.search;


/**
 * 两数之和 II - 输入有序数组(Two Sum)
 * <p>
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * <p>
 * 说明:
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * <p>
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 */
public class TwoSumII {


    /**
     * Accepted
     * <p>
     * 时间复杂度O(nlgn) 一层循环(O(n))中嵌二分查找(O(lgn))
     * <p>
     */
    public int[] twoSum_one(int[] numbers, int target) {
        int one;
        int res[] = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            one = numbers[i];
            int index = binarySearch(numbers, target - one);
            if (index != -1) {
                res[0] = i + 1;
                res[1] = index + 1;
                return res;
            }
        }
        return res;

    }

    public int binarySearch(int[] array, int num) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int lo = 0, hi = array.length;  //[lo...hi)
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (num > array[mid]) {
                lo = mid + 1;
            } else if (num < array[mid]) {
                hi = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }


    /**
     * Accepted
     * 对撞指针法
     * 时间复杂度O(n)
     *
     */
    public int[] twoSum_two(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int res[] = new int[2];
        while (i <= j) {
            if (numbers[i] + numbers[j] == target) {
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            }
            if (numbers[i] + numbers[j] < target) {
                i++;
            }
            if (numbers[i] + numbers[j] > target) {
                j--;
            }
        }
        return res;
    }
}
