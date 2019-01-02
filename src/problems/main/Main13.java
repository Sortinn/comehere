package problems.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main13 {
  public static long res(int code, long start, long end) {
    int res = 0;
    Map<Long, Long> map = new HashMap<>();
    long mid = start + (end - start) / 2;
    for (long i = mid; i <= end; i++) {
      long cnt = 0;
      long num = i;
      while (num > 0) {
        long yu = num % code;
        if (yu == code - 1) {
          map.put(i, ++cnt);
        } else {
          map.put(i, (long) 0);
        }
        num /= code;
      }

    }
    long max = 0;
    long key = end + 1;
    Iterator<Map.Entry<Long, Long>> entryIterator = map.entrySet().iterator();
    while (entryIterator.hasNext()) {
      Map.Entry<Long, Long> aMap = entryIterator.next();
      if (aMap.getValue() > max) {
        key = aMap.getKey();
        max = aMap.getValue();
      } else if (aMap.getValue() == max && aMap.getKey() < key) {
        key = aMap.getKey();
      }
    }
    return key;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    String line = null;
    while (n > 0) {
      line = bf.readLine();
      String[] strings = line.split(" ");
      int code = Integer.parseInt(strings[0]);
      long start = Long.parseLong(strings[1]);
      long end = Long.parseLong(strings[2]);
      System.out.println(res(code, start, end));
      n--;
    }
  }
}
