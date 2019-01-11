package comehere.problems.leetcode.main;

import java.util.*;

public class Main10 {

  public static List<Integer> res(List<Integer> in) {

    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < in.size(); i++) {
      Queue<Integer> queue = new LinkedList<>();
      Integer integer = in.get(i);
      int i1 = integer % 2;
      while (i1 == 0) {
        queue.offer(i1);
        integer /= 2;
        i1 = integer % 2;
      }
      queue.offer(i1);

      int index = 0;
      int singleRes = 0;
      while (!queue.isEmpty()) {
        singleRes += queue.poll() * ((int)Math.pow(2, index++));
      }
      res.add(singleRes);
    }
    return res;
  }
  public static void main(String[] args) {

    ArrayList<Integer> in = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int next = input.nextInt();
    while (next != 0) {
      in.add(next);
      next = input.nextInt();
    }
    List<Integer> res = res(in);
    for (int i = 0; i < res.size(); i++) {
      System.out.println(res.get(i));
    }
  }
}
