package tinytest.hashmaptest;

import com.google.common.collect.Maps;
import java.util.HashMap;

/**
 * @author sortinn
 * @create 2018.11.29 2:28 PM
 * @description 测试HashMap的toString()
 **/
public class HashMapToStringTest {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = Maps.newHashMap();
        hashMap.put("姓名", "高天");
        hashMap.put("性别", "男");
        hashMap.put("国籍", "中国");
        System.out.println(hashMap);
    }
}
