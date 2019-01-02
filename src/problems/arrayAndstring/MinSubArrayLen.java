package problems.arrayAndstring;

public class MinSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        int l = 0, r = -1;     //[l..r]
        int sum = 0;
        int res = nums.length + 1;
        while (l < nums.length) {
            if (sum < s && r + 1 < nums.length) { //当 r 已经到达数组末尾的时候，就不能再动 r 了
                sum += nums[++r]; //还没有得到一种解
            } else {
                //res = min(res, r - l + 1);    //不能写在这里，if条件中任一条件不满足都会跳进else中进行min计算，这在当r到达数组末尾的时候，结果出现错误。
                sum -= nums[l++]; //已得到一种 和>=s 的解
            }

            if (sum >= s) {                     //应该写在这里，将逻辑和计算分开
                res = min(res, r - l + 1);
            }

        }

        if (res == nums.length + 1) return 0;

        return res;
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        MinSubArrayLen test = new MinSubArrayLen();
        int res = test.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        System.out.println(res);
    }
}
