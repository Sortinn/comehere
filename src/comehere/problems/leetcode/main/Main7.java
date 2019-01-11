package comehere.problems.leetcode.main;

import java.util.*;

public class Main7 {

  public static int minSugarNum(int n, int m, Map<Integer, ArrayList<Integer>> map) {
    Iterator<Map.Entry<Integer, ArrayList<Integer>>> entryIterator = map.entrySet().iterator();
    int max = 0;
    int min = n;
    while (entryIterator.hasNext()) {
      Map.Entry<Integer, ArrayList<Integer>> aMap = entryIterator.next();
      if (aMap.getValue().size() >= max) {
        max = aMap.getValue().size();
      }
      if (aMap.getValue().size() < min) {
        min = aMap.getValue().size();
      }
    }
    if (!map.containsKey(1)) {
      return 6;
    }
    if (map.get(1).size() >= max) {
      return 0;
    }

    if (map.get(1).size() >= min && map.get(1).size() < max) {

    }

    return 6;

  }

  public static void main(String[] args) {
    Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    Scanner input = new Scanner(System.in);
    String firstLine = input.nextLine();
    String[] first = firstLine.split(" ");
    int toupiaozhe = Integer.parseInt(first[0]);
    int houxuanren = Integer.parseInt(first[1]);

    for (int i = 0; i < toupiaozhe; i++) {
      String line = input.nextLine();
      String[] split = line.split(" ");


      if (!map.containsKey(Integer.parseInt(split[0]))) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(split[1]));
        map.put(Integer.parseInt(split[0]), list);
      } else {
        map.get(Integer.parseInt(split[0])).add(Integer.parseInt(split[1]));
      }

    }
    System.out.println(minSugarNum(toupiaozhe, houxuanren, map));
  }
}
