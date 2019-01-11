package problems.leetcode.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main9 {

  public static char res(String string) {
    Map<Character, Integer> map = new HashMap<>();
    String lowerCase = string.toLowerCase();
    char res = ' ';
    for (int i = 0; i < string.length(); i++) {
      char key = lowerCase.charAt(i);
      if (!map.containsKey(key)) {
        map.put(key, 1);
      } else {
        int cnt = map.get(key);
        if (++cnt == 3) {
          res = key;
          break;
        }
        map.put(key, cnt);
      }
    }

    return res;

  }

  public static void main(String[] args) {
    String in = new Scanner(System.in).next();
    char res = res(in);
    if (res == ' ') {
      System.out.println(0);
    } else {
      int result = (res - 'a' + 1);
      System.out.println(result);
    }
  }
}
