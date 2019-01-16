package tinytest.stringtest;

/**
 * @author tian.gao
 * @create 2019.01.16 5:33 PM
 **/
public class StringParamPass {

    private static String testStringParamPass(String input) {
        input = input.substring(6);
        return input;
    }

    public static void main(String[] args) {
        String input = "string input";
        input = StringParamPass.testStringParamPass(input);
        System.out.println(input);
    }
}
