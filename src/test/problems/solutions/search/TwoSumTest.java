package test.problems.solutions.search;

import org.junit.*;
import problems.search.TwoSum;

/**
 * TwoSum Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 28, 2018</pre>
 */
public class TwoSumTest {

    private static TwoSum test;

    @BeforeClass
    public static void createObj() {
        test = new TwoSum();
    }

    /**
     * Method: twoSum(int[] nums, int target)
     */
    @Test
    public void testTwoSum() throws Exception {
        int[] array = {2, 7, 11, 15};
        int[]res = test.twoSum_On2(array, 9);
        Assert.assertArrayEquals(new int[]{0,1}, res);
    }


} 
