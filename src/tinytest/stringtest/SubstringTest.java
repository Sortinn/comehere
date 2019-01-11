package tinytest.stringtest;

/**
 * @author sortinn
 * @create 2018.11.27 3:34 PM
 * @description 测试String.substring()
 **/
public class SubstringTest {



    public static void main(String[] args) {

        String target = "gaotian";
        String content = "I like gaotian";
        if (content.indexOf(target) != -1) {
            System.out.println("I really like gaotian");
            System.out.println("target \"" + target + "\"'s start position is on " + content.indexOf(target));
            System.out.println(content.substring(content.indexOf(target)));
        }else {
            System.out.println("I still like gaotian");
        }
    }
}
