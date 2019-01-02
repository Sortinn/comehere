package test.problems.solutions.math;

import org.junit.*;
import problems.math.MyPow;

import static org.junit.Assert.assertEquals;

/**
 * MyPow Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jul 26, 2018</pre>
 */
public class MyPowTest {


    private static MyPow myPow;
    @BeforeClass
    public static void beforeClass() throws Exception {
        myPow = new MyPow();
    }


    @Test
    public void test_n_is_even() {
        double res = myPow.pow(2, 6);
        assertEquals(64.0, res, 0);
    }

    @Test
    public void test_n_is_not_even() {
        double res = myPow.pow(2, 5);
        assertEquals(32, res, 0);
    }

} 
