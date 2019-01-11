package comehere.problems.leetcode.sort;

public class BubbleSort<E extends Comparable> implements Sort {

    @Override
    public void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    Comparable temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    @Override
    public void sortImprove(Comparable[] arr) {

    }



    public static void main(String[] args) {
        Integer[] arr = new Integer[]{23, 42, 1, 222, 4, 33, 7, 21, 22};
        BubbleSort<Integer> integerBubbleSort = new BubbleSort<>();
        System.out.println(integerBubbleSort);
        integerBubbleSort.sort(arr);
        System.out.println(integerBubbleSort);
    }
}
