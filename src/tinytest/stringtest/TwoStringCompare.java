package tinytest.stringtest;

/**
 * @author tian.gao
 * @create 2018.12.28 5:31 PM
 **/
public class TwoStringCompare {

    public static void main(String[] args) {

        String s = new String("1");
        s.intern();
        String s1 = "1";
        System.out.println(s == s1);
    }
}
