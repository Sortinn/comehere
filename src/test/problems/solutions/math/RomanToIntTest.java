package test.problems.solutions.math;

import org.junit.BeforeClass;
import org.junit.Test;
import problems.math.RomanToInt;

import static org.junit.Assert.assertEquals;

/**
 * RomanToInt Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 24, 2018</pre>
 */
public class RomanToIntTest {

    private static RomanToInt test;

    @BeforeClass
    public static void beforeClass() throws Exception {
        test = new RomanToInt();
    }

    /**
     * Method: romanToInt(String s)
     */
    @Test
    public void three_Is_or_less_than_three() throws Exception {
        Integer res = test.romanToInt("III");
        assertEquals(new Integer(3), res);
    }

    @Test
    public void string_is_sorted_ascending() throws Exception {
        Integer res = test.romanToInt("LVIII");
        assertEquals(new Integer(58), res);
    }

    @Test
    public void string_is_sorted_descendsing_with_V() throws Exception {
        Integer res = test.romanToInt("IV");
        assertEquals(new Integer(4), res);
    }

    @Test
    public void string_is_sorted_descendsing_with_X() throws Exception {
        Integer res = test.romanToInt("IX");
        assertEquals(new Integer(9), res);
    }

    @Test
    public void string_is_sorted_descendsing_with_X_V() throws Exception {
        Integer res = test.romanToInt("XXVII");
        assertEquals(new Integer(27), res);
    }

    @Test
    public void string_is_not_sorted() throws Exception {
        Integer res = test.romanToInt("MCMXCIV");
        assertEquals(new Integer(1994), res);
    }

} 
