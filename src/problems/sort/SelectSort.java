package problems.sort;

import java.util.Random;

public class SelectSort<E> implements Sort {



    @Override
    public void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    Comparable temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
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
        SelectSort<Integer> selectSort = new SelectSort<>();
        System.out.println(selectSort);
        selectSort.sort(arr);
        System.out.println(selectSort);
    }
}

