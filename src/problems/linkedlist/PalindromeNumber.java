package problems.linkedlist;


/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 示例 1:
 * 输入: 121
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * <p>
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * <p>
 * 想法一：将数字本身反转，然后将反转后的数字与原始数字进行比较，如果它们是相同的，那么这个数字就是回文。
 * 问题：但是，如果反转后的数字大于int.MAX,我们将遇到整数溢出问题。
 * <p>
 * 想法二：为了避免数字反转可能导致的溢出问题，为什么不考虑只反转int数字的一半？毕竟，如果该数字是回文，其后半部分反转后应该与原始数字的前半部分相同。
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int secondHalf = 0;  //后半段数字
        while (secondHalf < x) {

            int digit = x % 10;
            secondHalf = secondHalf * 10 + digit;
            x /= 10;

        }
        //偶数为回文数  secondHalf == x
        //奇数为回文数  secondHalf / 10 == x
        return (secondHalf == x) || (secondHalf / 10 == x);
    }
}
