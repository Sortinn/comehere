package comehere.problems.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author tian.gao
 * @create 2019.01.19 9:45 PM
 * @leetcode 771. Jewels and Stones
 **/
public class JewelsAndStones {

    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        Set<Character> setJ = new HashSet<>();
        for (Character charJ : J.toCharArray()) {
            setJ.add(charJ);
        }
        for (Character charS : S.toCharArray()) {
            if (setJ.contains(charS)) {
                result++;
            }
        }
        return result;
    }
}
