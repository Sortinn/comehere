package problems.leetcode.sort;

import java.util.Random;

public class InsertSort<E> implements Sort {


    @Override
    public void sort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j - 1].compareTo(arr[j]) > 0; j--) {
                Comparable temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }
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
        InsertSort<Integer> integerInsertSort = new InsertSort<>();
        System.out.println(integerInsertSort);
        integerInsertSort.sort(arr);
        System.out.println(integerInsertSort);
    }

}
