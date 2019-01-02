package test.problems.solutions.sort;

import org.junit.BeforeClass;
import org.junit.Test;
import problems.sort.MergeSortedArray;

import static org.junit.Assert.assertArrayEquals;

/**
 * MergeSortedArray Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 25, 2018</pre>
 */
public class MergeSortedArrayTest {

    private static MergeSortedArray test;

    @BeforeClass
    public static void createObject() {
        test = new MergeSortedArray();
    }

    /**
     * Method: merge(int[] nums1, int m, int[] nums2, int n)
     */
    @Test
    public void test_merge_one() throws Exception {
        int[] nums1 = {0, 0, 0, 1, 2, 3};
        int[] nums2 = {2, 5, 6};
        int[] res = test.merge(nums1, 6, nums2, 3);
        int[] expected = {0, 0, 0, 1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, res);
    }

    @Test
    public void test_merge_two() throws Exception {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] res = test.merge(nums1, 3, nums2, 3);
        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, res);
    }

} 
