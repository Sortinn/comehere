package comehere.problems.leetcode.string;

/**
 * @author tian.gao
 * @create 2019.01.21 10:50 PM
 * @leetcode 709. To Lower Case
 **/
public class ToLowerCase {

    public static String toLowerCase(String str) {
        if (str == null) return null;
        StringBuilder sb = new StringBuilder();
        int between = 'a' - 'A';
        for (char c : str.toCharArray()) {
            if (c + between <= 'z' && c + between >= 'a') {
                sb.append((char) (c + between));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
