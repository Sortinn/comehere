package problems.tinytest.hashtest;

/**
 * @author sortinn
 * @create 2018.11.29 10:10 AM
 * @description 测试String的hashCode()
 **/
public class StringHashCodeTest {
    public static void main(String[] args) {
        String stringA = "gaotian";
        String stringB = "gaouian";

        Integer stringA_HashCode = stringA.hashCode();
        Integer stringB_HashCode = stringB.hashCode();

        System.out.println(stringA_HashCode);
        System.out.println(stringB_HashCode);
    }
}
