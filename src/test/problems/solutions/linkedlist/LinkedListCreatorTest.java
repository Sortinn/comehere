package test.problems.solutions.linkedlist;

import datastructure.linkedList.LinkedListCreator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * LinkedListCreator Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jun 15, 2018</pre>
 */
public class LinkedListCreatorTest {


    private static LinkedListCreator test;

    @BeforeClass
    public static void createObject() {
//        System.out.println("I am before class");
         test = new LinkedListCreator();
    }

    @Before
    public void before() throws Exception {
        System.out.println("I am before");
    }


    @After
    public void after() throws Exception {
        System.out.println("I am after");
    }

    @AfterClass
    public static void finish() {
        System.out.println("I am after class");
    }

    /**
     * Method: createLinkedList(List<Integer> data)
     */

    @Test
    public void list_is_empty() throws Exception {
//TODO: Test goes here...
        assertEquals(test.createLinkedList(new ArrayList<>()), null);
    }

    @Test
    public void list_contains_one_element() throws Exception {
//TODO: Test goes here...
        assertEquals(test.createLinkedList(Arrays.asList(1)).getValue(), 1);
    }


    @Test
    public void list_is_normal() throws Exception {
//TODO: Test goes here...
        assertEquals(test.createLinkedList(Arrays.asList(4, 2, 5, 3, 2)).getValue(), 4);
    }
} 
