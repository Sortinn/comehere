package comehere.problems.leetcode.sort.testsort;

import comehere.problems.leetcode.sort.BubbleSort;
import comehere.problems.leetcode.sort.InsertSort;
import comehere.problems.leetcode.sort.SelectSort;
import comehere.problems.leetcode.sort.Sort;

import java.util.Random;

public class TestSort {

    public static double testSort(Sort<Integer> sortAlg, int n) {

        Integer[] arr = new Integer[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(Integer.MAX_VALUE);
        }

        long startTime = System.nanoTime();
        sortAlg.sort(arr);
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {

        int n = 100000;
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        double time1 = testSort(bubbleSort, n);
        System.out.println("BubbleSort: " + time1 + " s ");

        SelectSort<Integer> selectSort = new SelectSort<>();
        double time2 = testSort(selectSort, n);
        System.out.println("SelectSort: " + time2 + " s ");

        InsertSort<Integer> insertSort = new InsertSort<>();
        double time3 = testSort(insertSort, n);
        System.out.println("InsertSort: " + time3 + " s ");

//        QuickSort<Integer> quickSort = new QuickSort<>();
//        double time4 = testSort(quickSort, n);
//        System.out.println("QuickSort: " + time4 + " s ");
//
//        MergeSort<Integer> mergeSort = new MergeSort<>();
//        double time5 = testSort(mergeSort, n);
//        System.out.println("MergeSort: " + time5 + " s ");
    }
}
