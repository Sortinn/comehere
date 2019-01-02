package problems.search;

import java.util.HashMap;
import java.util.Map;

public class FourSumII {


    /**
     * No.454
     * <p>
     * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
     * <p>
     * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -2^28 到 2^28 - 1 之间，最终结果不会超过 2^31 - 1 。
     * <p>
     * 例如:
     * <p>
     * 输入:
     * A = [ 1, 2]
     * B = [-2,-1]
     * C = [-1, 2]
     * D = [ 0, 2]
     * <p>
     * 输出:
     * 2
     * <p>
     * 解释:
     * 两个元组如下:
     * 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
     * 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
     */
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int len = A.length;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (map.containsKey(C[i] + D[j])) {
                    Integer times = map.get(C[i] + D[j]);
                    map.put(C[i] + D[j], ++times);
                } else {
                    map.put(C[i] + D[j], 1);
                }
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (map.containsKey(0 - A[i] - B[j])) {
                    res += map.get(C[i] + D[j]);
                }
            }
        }
        return res;
    }
}
