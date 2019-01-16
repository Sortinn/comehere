package comehere.problems.leetcode.string;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author tian.gao
 * @create 2019.01.15 2:03 PM
 * @leetcode 8. String to Integer (atoi)
 **/
public class StringToInteger {
    public static int myAtoi(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.trim();
        if ("".equals(str)) return 0;
        char startC = str.charAt(0);
        if ((startC == '+' || startC == '-')) {
            if (startC == '-') {
                sb.append('-');
            }
            if (str.length() >= 2) {
                if (str.charAt(1) > '9' || str.charAt(1) < '0') {
                    return 0;
                }
                sb.append(str.charAt(1));
                if (str.length() > 2) {
                    for (int i = 2; i < str.length(); i++) {
                        if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                            break;
                        } else {
                            sb.append(str.charAt(i));
                        }
                    }
                }
            } else {
                return 0;
            }
        } else if (startC > '9' || startC < '0') {
            return 0;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    sb.append(str.charAt(i));
                } else {
                    break;
                }
            }
        }

        //现在的sb中可能包含前导零, 如"000002344322" 或 "-000000000001" 或 "00000000000"
        str = sb.toString();

        String positiveStr;
        int indexNotZero = getIndexNotZero(str);
        if (indexNotZero == str.length()) return 0;
        positiveStr = str.substring(indexNotZero);
        if (positiveStr.length() > 10) {
            return str.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        } else if (positiveStr.length() == 10) {
            if (str.charAt(0) == '-') {
                return str.compareTo(Integer.MIN_VALUE + "") >= 0 ? Integer.MIN_VALUE : -new Integer(positiveStr);
            } else {
                return str.compareTo(Integer.MAX_VALUE + "") >= 0 ? Integer.MAX_VALUE : new Integer(positiveStr);
            }
        } else {
            return str.charAt(0) == '-' ? -new Integer(positiveStr) : new Integer(positiveStr);
        }

    }

    private static int getIndexNotZero(String str) {
        int indexNotZero = 0;
        String newStr = str;
        if (str.charAt(0) == '-') {
            newStr = str.substring(1);
        }
        if (newStr.startsWith("0")) {
            while (indexNotZero < newStr.length()) {
                if (newStr.charAt(indexNotZero) == '0') {
                    indexNotZero++;
                } else {
                    break;
                }
            }
        }
        return str.charAt(0) == '-' ? indexNotZero + 1 : indexNotZero;
    }
}
