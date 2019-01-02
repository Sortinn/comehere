package test.problems.solutions.search;

import org.junit.BeforeClass;
import org.junit.Test;
import problems.search.TwoSumII;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * TwoSumII Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 25, 2018</pre>
 */
public class TwoSumIITest {

    private static TwoSumII test;

    @BeforeClass
    public static void createObj() throws Exception {
        test = new TwoSumII();
    }


    /**
     * Method: binarySearch(int[] arrayAndstring, int num)
     */
    @Test
    public void contains_result() throws Exception {
        int input[] = {1, 2, 3, 6, 9, 33, 66, 543};
        int res = test.binarySearch(input, 9);
        assertEquals(4, res);
    }

    @Test
    public void not_contains_result() throws Exception {
        int input[] = {1, 2, 3, 6, 9, 33, 43, 55, 66, 543};
        int res = test.binarySearch(input, 44);
        assertEquals(-1, res);
    }

    @Test
    public void empty_array() throws Exception {
        int input[] = {};
        int res = test.binarySearch(input, 44);
        assertEquals(-1, res);
    }

    @Test
    public void contains_only_one_element() throws Exception {
        int input[] = {4};
        int res = test.binarySearch(input, 44);
        assertEquals(-1, res);
    }


    /**
     * Test twoSum_one()
     *
     * @throws Exception
     */
    @Test
    public void two_sum_test_can_find() throws Exception {
        int input[] = {2, 7, 11, 15};
        int[] res = test.twoSum_one(input, 9);
        assertArrayEquals(new int[]{1, 2}, res);
    }

    @Test
    public void two_sum_test_cannot_find() throws Exception {
        int input[] = {1, 4, 4, 7};
        int[] res = test.twoSum_one(input, 9);
        assertArrayEquals(new int[]{0, 0}, res);
    }

    @Test
    public void two_sum_test_contains_repeated_elements() throws Exception {
        int input[] = {1, 4, 4, 7};
        int[] res = test.twoSum_one(input, 8);
        assertArrayEquals(new int[]{1, 4}, res);
    }


    /**
     * Test twoSum_two()
     *
     * @throws Exception
     */
    @Test
    public void can_find_result() throws Exception {
        int input[] = {2, 7, 11, 15};
        int[] res = test.twoSum_two(input, 9);
        assertArrayEquals(new int[]{1, 2}, res);
    }

    @Test
    public void cannot_find_result() throws Exception {
        int input[] = {1, 4, 4, 7};
        int[] res = test.twoSum_two(input, 9);
        assertArrayEquals(new int[]{0, 0}, res);
    }

    @Test
    public void contains_repeated_elements() throws Exception {
        int input[] = {1, 4, 4, 7};
        int[] res = test.twoSum_two(input, 8);
        assertArrayEquals(new int[]{1, 4}, res);
    }

} 
