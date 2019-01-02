package problems.search;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBoomerangs {
    /**
     * 给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
     * <p>
     * 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。
     * <p>
     * 示例:
     * <p>
     * 输入:
     * [[0,0],[1,0],[2,0]]
     * <p>
     * 输出:
     * 2
     * <p>
     * 解释:
     * 两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
     */
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> record = new HashMap<>();
            
            for (int j = 0; j < points.length; j++) {
                int distance = getDistance(points[i], points[j]);
                if (record.containsKey(distance)) {
                    Integer times = record.get(distance);
                    record.put(distance, ++times);
                } else {
                    record.put(distance, 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : record.entrySet()) {
                if (entry.getValue() != 1) {
                    res += entry.getValue() * (entry.getValue() - 1);
                }
            }
        }

        return res;
    }

    private int getDistance(int[] node1, int[] node2) {
        return (node1[0] - node2[0]) * (node1[0] - node2[0]) + (node1[1] - node2[1]) * (node1[1] - node2[1]);
    }


    public static void main(String[] args) {
        NumberOfBoomerangs number = new NumberOfBoomerangs();

        int i = number.numberOfBoomerangs(new int[][]{{0, 0}, {1, 0}, {2, 0}});

        System.out.println(i);
    }
}
