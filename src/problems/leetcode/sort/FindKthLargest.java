package problems.leetcode.sort;

public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        int lo = 0, hi = nums.length;
        int res = 0;
        int j = partition(nums, lo, hi);
        while (lo < hi) {
            if (j > k) {
                j = partition(nums, lo, j);
            } else if (j < k) {
                lo = j + 1;
                j = partition(nums, lo, hi);
            } else {
                res = nums[j];
            }
        }
        return res;
    }

    private static int partition(int[] nums, int lo, int hi) {
        int i = lo;
        int j = hi;
        int v = nums[lo];
        while (true) {
            while (nums[++i] > v) {
                if (i == hi) {
                    break;
                }
            }
            while (nums[--j] < v) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, lo, j);
        return j + 1;
    }

    private static void swap(int[] nums, int p, int q) {
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }

    public static void main(String[] args) {
        int[] test = new int[]{-1, 2, 0};
//        int[] teststack = new int[]{3, 2, 1, 5, 6, 4};
        FindKthLargest findKthLargest = new FindKthLargest();
        System.out.println(findKthLargest.findKthLargest(test, 1));
    }

}
