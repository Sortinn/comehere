package comehere.problems.leetcode.arrayAndstring;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = -1;       //[l...r]
        int res = 0;

        Set<Character> set = new HashSet<>();

        while (l < s.length() && r + 1 < s.length()) {

            if (!set.contains(s.charAt(r + 1))) {
                set.add(s.charAt(++r));
            } else {
                set.remove(s.charAt(l++));
            }
            res = Math.max(res, r - l + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring test = new LengthOfLongestSubstring();
        System.out.println(test.lengthOfLongestSubstring("pwwkew"));
    }

}
