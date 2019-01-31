package comehere.problems.leetcode.unionfind;

import comehere.practice.datastructure.unionfind.qucikunionpathcompression.UnionFind5;

/**
 * @author tian.gao
 * @create 2019.01.31 5:58 PM
 * @leetcode 547. Friend Circles
 **/
public class FriendCircles {

    public int findCircleNum(int[][] M) {
        if (M == null || M.length == 0) return 0;
        int size = M.length;
        UnionFind5 uf = new UnionFind5(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == 1) {
                    uf.unionElements(i, j);
                }
            }
        }
        return uf.getCnt();
    }
}
