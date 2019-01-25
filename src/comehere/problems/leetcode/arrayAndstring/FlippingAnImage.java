package comehere.problems.leetcode.arrayAndstring;

/**
 * @author tian.gao
 * @create 2019.01.24 11:07 PM
 * @leetcode 832. Flipping an Image
 **/
public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {

        int[][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            int point = A[i].length - 1;
            for (int j = 0; j < A[i].length; j++) {
                res[i][j] = A[i][point--] == 0 ? 1 : 0;
            }
        }
        return res;
    }
}
