package problems.leetcode.linkedlist;

/**
 * @author tian.gao
 * @create 2019.01.10 11:49 PM
 **/
public class ReverseInteger {

    public static int reverse(int x) {
        if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE || x == 0) return 0;
        int absoluteX = x >= 0 ? x : (0 - x);
        String xs = absoluteX + "";

        StringBuilder reverseSB = new StringBuilder();
        for (int i = xs.length() - 1; i >= 0; i--) {
            reverseSB.append(xs.charAt(i));
        }

        String reverseS = reverseSB.toString();
        reverseS = String.valueOf(Long.parseLong(reverseS));
        Long reverseL = new Long(reverseS);
        if (x > 0 && reverseL > Integer.MAX_VALUE) return 0;
        if (x < 0 && 0 - reverseL < Integer.MIN_VALUE) return 0;
        Integer reverseI = new Integer(reverseS);
        return x >= 0 ? reverseI : (0 - reverseI);
    }

    public static void main(String[] args) {
        int reverse = ReverseInteger.reverse(-2147483648);
        System.out.println(reverse);
    }
}
