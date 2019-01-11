package tinytest.patterntest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sortinn
 * @create 2018.12.05 3:42 PM
 * @description 测试正则匹配
 **/
public class PatternTest {


    public static void main(String[] args) {
        String content = "${small_cat}${big_dog}${giant_fish}";
        Pattern pattern = Pattern.compile("(?<=\\{)[^\\}]+");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println( matcher.group());
            System.out.println( matcher.group());

        }

    }
}
