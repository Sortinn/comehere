package problems.leetcode.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main11 {


  /**
   * 3
   * 3 2
   * 01 11 10
   * 11 00 10
   * 2 3
   * 101 111
   * 010 001
   * 2 2
   * 01 10
   * 10 01
   *
   * @param hole
   * @param key
   * @return
   */
  public static String res(String hole, String key) {
    String res = "";
    ArrayList<String> holeList = new ArrayList<>();
    ArrayList<String> keyList = new ArrayList<>();

    if (hole.equals(key)) {
      res = "0";
      return res;
    }

    String[] holes = hole.split(" ");
    String[] keys = key.split(" ");
    for (int i = 0; i < keys.length; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < holes[i].length() - 1; j++) {
        sb.append(holes[j]);
      }
      if (holes[i].charAt(holes[i].length() - 1) == '0') {
        sb.append("1");
      } else if (holes[i].charAt(holes[i].length() - 1) == '1') {
        sb.append("0");
      }
      holeList.add(sb.toString());
      keyList.add(keys[i]);

    }
    holeList.sort((o1, o2) -> o1.hashCode() - o2.hashCode());
    keyList.sort((o1, o2) -> o1.hashCode() - o2.hashCode());

    for (int i = 0; i < holeList.size(); i++) {
      String shole = holeList.get(i);
      String skey = keyList.get(i);
      if (shole.equals(skey)) {
        res = "1";
      } else {
        res = "NOT POSSIBLE";
      }
    }
    return res;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String num = br.readLine();
    for (int i = 0; i < Integer.parseInt(num); i++) {
      String first = br.readLine();
      String[] firstLine = first.split(" ");
      String second = br.readLine();
      String third = br.readLine();
      System.out.println(res(second, third));
    }
  }
}
