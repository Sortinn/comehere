package comehere.problems.leetcode.sort;

import java.util.Arrays;


/**
 * leetcode no.75 Sort Colors
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 * 进阶：一个直观的解决方案是使用计数排序的两趟扫描算法。
 * 首先，迭代计算出0、1 和 2 元素的个数，然后按照0、1、2的排序，重写当前数组。
 *
 * 你能想出一个仅使用常数空间的一趟扫描算法吗？
 */
public class SortColors {
    private int[] nums;

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public int[] getNums() {
        return nums;
    }

    public void sortColorsMethodOne(int[] nums) {
        Arrays.sort(nums);              //暴力排序,可以被Accepted
    }

    public void sortColorsMethodTwo(int[] nums) {
        //计数排序（桶排）
        int[] count = new int[]{0, 0, 0};
        for (int num : nums) {
            count[num]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                nums[index++] = i;
            }
        }
    }


    //三路快速排序

    public void sortColorsMethodThree(int[] nums) {
        int zero = -1;           // nums[0 ... zero] == 0
        int two = nums.length;   // nums[two ... n-1] == 2
        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, --two);
            } else {
                swap(nums, ++zero, i++);
            }
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
