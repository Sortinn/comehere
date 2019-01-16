package comehere.problems.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringToIntegerTest {

    @Test
    public void test_with_numbers() {
        String input = "43";
        Assert.assertEquals(43, StringToInteger.myAtoi(input));
    }

    @Test
    public void test_with_neg_numbers() {
        String input = "-43";
        Assert.assertEquals(-43, StringToInteger.myAtoi(input));
    }


    @Test
    public void test_with_blank_numbers() {
        String input = "  43";
        Assert.assertEquals(43, StringToInteger.myAtoi(input));
    }

    @Test
    public void test_with_blank_neg_numbers() {
        String input = "  -43";
        Assert.assertEquals(-43, StringToInteger.myAtoi(input));
    }

    @Test
    public void test_with_numbers_and_words() {
        String input = "4193 with words";
        Assert.assertEquals(4193, StringToInteger.myAtoi(input));
    }

    @Test
    public void test_with_words_and_numbers() {
        String input = "words and 987";
        Assert.assertEquals(0, StringToInteger.myAtoi(input));
    }

    @Test
    public void test_with_small_numbers_overflow() {
        String input = "-2147483648";
        Assert.assertEquals(Integer.MIN_VALUE, StringToInteger.myAtoi(input));
    }

    @Test
    public void test_with_big_numbers_overflow() {
        String input = "2147483648";
        Assert.assertEquals(Integer.MAX_VALUE, StringToInteger.myAtoi(input));
    }

    @Test
    public void test_with_empty() {
        String input = "";
        Assert.assertEquals(0, StringToInteger.myAtoi(input));
    }

    @Test
    public void test_with_numbers_start_with_zero() {
        String input = "  0000000000012345678";
        Assert.assertEquals(12345678, StringToInteger.myAtoi(input));
    }

    @Test
    public void test_with_string_with_all_zeros() {
        String input = "  00000000000000";
        Assert.assertEquals(0, StringToInteger.myAtoi(input));
    }

    @Test
    public void test_with_string_with_neg_all_zeros() {
        String input = "  -000000000000001";
        Assert.assertEquals(-1, StringToInteger.myAtoi(input));
    }
}