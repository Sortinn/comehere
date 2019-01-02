package test.problems.solutions.linkedlist;

import datastructure.linkedList.ListNode;
import org.junit.*;
import problems.linkedlist.AddTwoNumbers;
import datastructure.linkedList.LinkedListCreator;

import java.util.Arrays;

/**
 * AddTwoNumbers Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 29, 2018</pre>
 */
public class AddTwoNumbersTest {


    private static AddTwoNumbers test;
    private static LinkedListCreator creator;

    @BeforeClass
    public static void createObj() {
        test = new AddTwoNumbers();
        creator = new LinkedListCreator();
    }


    /**
     * Method: addTwoNumbers(ListNode l1, ListNode l2)
     */
    @Test
    public void testAddTwoNumbers() throws Exception {
        ListNode l1 = creator.createLinkedList(Arrays.asList(7, 0, 8));
        ListNode l2 = creator.createLinkedList(Arrays.asList(3, 5, 3));
        ListNode expected = creator.createLinkedList(Arrays.asList(0, 6, 1, 1));
        ListNode res = test.addTwoNumbers(l1, l2);
        while (res != null) {
            Assert.assertEquals(expected.getValue(), res.getValue());
            expected = expected.getNext();
            res = res.getNext();
        }
    }


} 
