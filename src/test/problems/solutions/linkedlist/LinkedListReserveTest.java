package test.problems.solutions.linkedlist;

import datastructure.linkedList.LinkedListCreator;
import problems.linkedlist.LinkedListReserve;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * LinkedListReserve Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 15, 2018</pre>
 */
public class LinkedListReserveTest {

    private static LinkedListCreator linkedlist;
    private static LinkedListReserve reserve;

    @BeforeClass
    public static void createObject() {
        linkedlist = new LinkedListCreator();
        reserve = new LinkedListReserve();
    }

    /**
     * Method: reserveLinkedList(ListNode head)
     */
    @Test
    public void list_is_empty() throws Exception {
//TODO: Test goes here...
        assertEquals(
                reserve.reserveLinkedList(
                        linkedlist.createLinkedList(new ArrayList<>())), null);
    }

    @Test
    public void list_contains_one_element() throws Exception {
//TODO: Test goes here...
        assertEquals(
                reserve.reserveLinkedList(
                        linkedlist.createLinkedList(Arrays.asList(1))).getValue(), 1);
    }


    @Test
    public void list_is_normal() throws Exception {
//TODO: Test goes here...
        assertEquals(
                reserve.reserveLinkedList(
                        linkedlist.createLinkedList(Arrays.asList(4, 2, 5, 3, 2))).getValue(), 2);
    }


} 
