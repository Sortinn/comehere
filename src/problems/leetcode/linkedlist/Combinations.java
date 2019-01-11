package problems.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {
  /**
   * find out all n-element-combinations in a list
   *
   * @param data the provided list
   * @param n    each combination's element number
   */
  public void getAllCombinations(List<Integer> selected, List<Integer> data, int n) {


    // if n equals zero, two conditions:
    // the one is the initial select number is zero,
    // the other is the n reduced to zero
    if (n == 0) {
      for (Integer i : selected) {
        System.out.print(i);
        System.out.print(" ");
      }
      System.out.println();
//      return;
    }

    if (data.isEmpty() || n > data.size()) {
      return;
    }
    //select element 0
    selected.add(data.get(0));
    getAllCombinations(selected, data.subList(1, data.size()), n - 1);

    //not select element 0
    selected.remove(selected.size() - 1);
    getAllCombinations(selected, data.subList(1, data.size()), n);
  }

  public static void main(String[] args) {
    Combinations combinations = new Combinations();
    combinations.getAllCombinations(new ArrayList<>(), new ArrayList<>(), 0);
    System.out.println("---------------------------------");
    combinations.getAllCombinations(new ArrayList<>(), Arrays.asList(1, 2, 3, 4), 5);
    System.out.println("---------------------------------");
    combinations.getAllCombinations(new ArrayList<>(), Arrays.asList(3, 1, 2, 7, 5, 4, 3), 4);
    System.out.println("---------------------------------");
    combinations.getAllCombinations(new ArrayList<>(), new ArrayList<>(), 1);
    System.out.println("---------------------------------");
    combinations.getAllCombinations(new ArrayList<>(), new ArrayList<>(), 0);
  }
}
