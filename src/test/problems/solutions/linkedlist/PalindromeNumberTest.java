package test.problems.solutions.linkedlist; 

import org.junit.*;
import problems.linkedlist.PalindromeNumber;

/** 
* PalindromeNumber Tester. 
* 
* @author <Authors name> 
* @since <pre>Jun 29, 2018</pre> 
* @version 1.0 
*/ 
public class PalindromeNumberTest { 

    private static PalindromeNumber test;

    @BeforeClass
    public static void createObj() {
        test = new PalindromeNumber();
    }
/** 
* 
* Method: isPalindrome(int x) 
* 
*/ 
@Test
public void given_number_is_negative() throws Exception {
    int num = -343;
    boolean res = test.isPalindrome(num);
    Assert.assertFalse(res);
}

    @Test
    public void given_number_is_end_with_zero() throws Exception {
        int num = 340;
        boolean res = test.isPalindrome(num);
        Assert.assertFalse(res);
    }

    @Test
    public void given_number_has_one_digit() throws Exception {
        int num = 4;
        boolean res = test.isPalindrome(num);
        Assert.assertTrue(res);
    }

    @Test
    public void given_number_is_palindrome() throws Exception {
        int num = 4343434;
        boolean res = test.isPalindrome(num);
        Assert.assertTrue(res);
    }




} 
