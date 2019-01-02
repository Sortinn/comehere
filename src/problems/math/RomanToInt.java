package problems.math;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    private static Map<Character, Integer> map = new HashMap<>();

    public RomanToInt() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        int res = 0;
        int temp = 0; //临时变量，用于判断加减
        int weight = 0; //当前读取到的罗马数字的权重

        //从后向前遍历字符串
        for (int i = s.length() - 1; i >= 0; i--) {
            weight = map.get(s.charAt(i));
            if (temp <= weight) {
                res += weight;
                temp = weight;
            } else {
                res -= weight;
                temp = weight;
            }
        }
        return res;
    }
}