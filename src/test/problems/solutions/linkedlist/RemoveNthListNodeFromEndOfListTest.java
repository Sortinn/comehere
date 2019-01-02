package test.problems.solutions.linkedlist;

import datastructure.linkedList.ListNode;
import org.junit.*;
import datastructure.linkedList.LinkedListCreator;
import problems.linkedlist.RemoveNthNodeFromEndOfList;

import java.util.Arrays;

/**
 * RemoveNthNodeFromEndOfList Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 29, 2018</pre>
 */
public class RemoveNthListNodeFromEndOfListTest {

    private static RemoveNthNodeFromEndOfList test;
    private static LinkedListCreator creator;

    @BeforeClass
    public static void createObj() {
        test = new RemoveNthNodeFromEndOfList();
        creator = new LinkedListCreator();
    }

    /**
     * Method: removeNthFromEnd(ListNode head, int n)
     */
    @Test
    public void linkedlist_is_empty() throws Exception {
        ListNode linkedList = creator.createLinkedList(Arrays.asList());
        ListNode expected = creator.createLinkedList(Arrays.asList());
        ListNode res = test.removeNthFromEnd(linkedList, 1);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void linkedlist_contains_one_node_and_remove_it() throws Exception {
        ListNode linkedList = creator.createLinkedList(Arrays.asList(1));
        ListNode res = test.removeNthFromEnd(linkedList, 1);
        ListNode expected = creator.createLinkedList(Arrays.asList());
        Assert.assertEquals(expected, res);
    }

    @Test
    public void linkedlist_contains_more_than_one_node() throws Exception {
        ListNode linkedList = creator.createLinkedList(Arrays.asList(1, 4, 5, 2, 3, 5));
        ListNode res = test.removeNthFromEnd(linkedList, 3);
        ListNode expected = creator.createLinkedList(Arrays.asList(1, 4, 5, 3, 5));
        while (res != null) {
            Assert.assertEquals(expected.getValue(), res.getValue());
            expected = expected.getNext();
            res = res.getNext();
        }
    }


}
