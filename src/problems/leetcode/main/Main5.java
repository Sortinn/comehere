package problems.leetcode.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

    public static int[] sort(int[] array) {
        ArrayList<Integer> ji = new ArrayList<>();
        ArrayList<Integer> ou = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ou.add(array[i]);
            } else {
                ji.add(array[i]);
            }
        }
        Object[] jiArray = ji.toArray();
        Arrays.sort(jiArray);
        Object[] ouArray = ou.toArray();
        Arrays.sort(ouArray);
        int i = 0;
        for (; i < ji.size(); i++) {
            array[i] = (int) jiArray[i];
        }
        int j = i;
        for (int k = 0; k < ouArray.length && j < array.length; k++, j++) {
            array[j] = (int) ouArray[k];
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        Main5.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
