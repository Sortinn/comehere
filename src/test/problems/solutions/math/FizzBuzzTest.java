package test.problems.solutions.math;

import org.junit.BeforeClass;
import org.junit.Test;
import problems.math.FizzBuzz;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * FizzBuzz Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 24, 2018</pre>
 */
public class FizzBuzzTest {


    private static FizzBuzz test;

    @BeforeClass
    public static void createObject() {
        test = new FizzBuzz();
    }

    /**
     * Method: fizzBuzz(int n)
     */
    @Test
    public void number_can_be_divided_by_three_only() throws Exception {
        int number = 6;
        String[] resArray = new String[]{
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz"
        };
        List<String> result = Arrays.asList(resArray);
        assertEquals(result, test.fizzBuzz(number));
    }

    @Test
    public void number_can_be_divided_by_five_only() throws Exception {
        int number = 5;
        String[] resArray = new String[]{
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz"
        };
        List<String> result = Arrays.asList(resArray);
        assertEquals(result, test.fizzBuzz(number));
    }

    @Test
    public void number_can_be_divided_by_five_and_three() throws Exception {
        int number = 15;
        String[] resArray = new String[]{
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"

        };
        List<String> result = Arrays.asList(resArray);
        assertEquals(result, test.fizzBuzz(number));
    }
}
