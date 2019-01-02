package test.problems.solutions.sort;

import org.junit.BeforeClass;
import org.junit.Test;
import problems.sort.SortColors;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * SortColors Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 25, 2018</pre>
 */
public class SortColorsTest {

    private static SortColors test;

    @BeforeClass
    public static void createObject() {
        test = new SortColors();
    }

    /**
     * Method: sortColorsMethodTwo(int[] nums)
     */
    @Test
    public void every_color_appears_once() throws Exception {
        int[] nums = {1, 2, 0};
        int[] res = {0, 1, 2};
        test.sortColorsMethodTwo(nums);
        assertArrayEquals(nums, res);
    }


    @Test
    public void complex_example() throws Exception {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] res = {0, 0, 1, 1, 2, 2,};
        test.sortColorsMethodTwo(nums);
        assertArrayEquals(nums, res);
    }

    @Test
    public void complex_example_one_with_method_three() throws Exception {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] res = {0, 0, 1, 1, 2, 2,};
        test.sortColorsMethodThree(nums);
        assertArrayEquals(nums, res);
    }

    @Test
    public void complex_example_two_with_method_three() throws Exception {
        int[] nums = {2, 0, 1};
        int[] res = {0, 1, 2};
        test.sortColorsMethodThree(nums);
        assertArrayEquals(nums, res);
    }

}
