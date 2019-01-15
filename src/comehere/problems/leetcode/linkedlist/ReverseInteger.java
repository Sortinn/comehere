package comehere.problems.leetcode.linkedlist;

/**
 * @author tian.gao
 * @create 2019.01.10 11:49 PM
 * @leetcode 7. Reverse Integer
 **/
public class ReverseInteger {

    //将输入当做字符串来做
    public static int reverseAsString(int x) {
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

    //常规方法，判断溢出的方法比较巧妙
    public static int reverseAsInt(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            //通过比较result是否相等来判断是否产生溢出
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int reverse = ReverseInteger.reverseAsString(-2147483648);
        int reverse1 = ReverseInteger.reverseAsInt(-2147483648);
        System.out.println(reverse);
        System.out.println(reverse1);
    }
}
