package problems.leetcode.setAndmap;


import java.util.HashSet;
import java.util.Set;

public class Intersection {

    /**
     * 给定两个数组，写一个函数来计算它们的交集。
     * <p>
     * 例子:
     * <p>
     * 给定 num1= [1, 2, 2, 1], nums2 = [2, 2], 返回 [2].
     * <p>
     * 提示:
     * <p>
     * 每个在结果中的元素必定是唯一的.
     * <p>
     * 我们可以不考虑输出结果的顺序。
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                res.add(nums2[i]);
            }
        }



        Integer[] resInteger = res.toArray(new Integer[]{});
        int[] resInt = new int[resInteger.length];
        for (int i = 0; i < resInteger.length; i++) {
            resInt[i] = resInteger[i];
        }

        return resInt;

    }

    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        int[] res = intersection.intersection(new int[]{ 1,2, 2, 1}, new int[]{2, 2});
        for (int aRes :
                res) {
            System.out.print(aRes + " ");
        }

    }
}
