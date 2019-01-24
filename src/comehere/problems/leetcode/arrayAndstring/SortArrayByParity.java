package comehere.problems.leetcode.arrayAndstring;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tian.gao
 * @create 2019.01.21 11:24 PM
 * @leetcode 905. Sort Array By Parity
 **/
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        if (A == null || A.length == 0) return null;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                a.add(A[i]);
            } else {
                b.add(A[i]);
            }
        }
        a.addAll(b);
        for (int i = 0; i < A.length; i++) {
            A[i] = a.get(i);
        }
        return A;
    }

    public static void main(String[] args) {
        int[] ints = new SortArrayByParity().sortArrayByParity(new int[]{3, 1, 2, 4});
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }

    }
}
