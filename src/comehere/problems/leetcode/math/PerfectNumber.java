package comehere.problems.leetcode.math;

/**
 * @author tian.gao
 * @create 2019.01.28 10:18 PM
 * @leetcode 507. Perfect Number
 **/
public class PerfectNumber {

    //时间复杂度O(n)
    public boolean checkPerfectNumber(int num) {
        if (num == 0) return false;
        int sum = num;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum -= i;
            }
        }
        return sum == 0;
    }
}
