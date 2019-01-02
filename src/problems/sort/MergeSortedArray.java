package problems.sort;

public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] aux = new int[m + n];

        int i = 0, j = 0;
        for (int index = 0; index < aux.length; index++) {
            if (i > m - 1) {
                aux[index] = nums2[j++];
            } else if (j > n - 1) {
                aux[index] = nums1[i++];
            } else if (nums1[i] < nums2[j]) {
                aux[index] = nums1[i++];
            } else {
                aux[index] = nums2[j++];
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        MergeSortedArray test = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] res = test.merge(nums1, 3, nums2, 3);
        int[] expected = {1, 2, 2, 3, 5, 6};
        for (int i = 0; i < res.length; i++) {

            System.out.print(res[i] + " ");
        }
        System.out.println();
    }

}
