package comehere.problems.leetcode.sort;

import java.util.Random;

public class QuickSort<E> implements Sort {

    @Override
    public void sort(Comparable[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    //将 [lo...hi] 闭区间内的元素排序
    private void sort(Comparable[] arr, int lo, int hi) {
        //循环终止条件
        if (lo >= hi) {
            return;
        }

        int j = partition(arr, lo, hi);

        //注意维持循环不变式 [lo...hi] 为闭区间
        //将 [lo...j-1] 和 [j+1...hi] 闭区间内的元素排序
        sort(arr, lo, j - 1);
        sort(arr, j + 1, hi);
    }

    public int partition(Comparable[] arr, int lo, int hi) {
        Comparable v = arr[lo];
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (arr[++i].compareTo(v) < 0){
                if (i == hi) {
                    break;
                }
            }
            while (arr[--j].compareTo(v) > 0) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            Comparable temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        Comparable temp = arr[j];
        arr[j] = arr[lo];
        arr[lo] = temp;

        return j;
    }

    @Override
    public void sortImprove(Comparable[] arr) {

    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = 20;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        new QuickSort<Integer>().sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
