package comehere.problems.leetcode.linkedlist;

import comehere.practice.datastructure.linkedList.ListNode;

public class LinkedListReserve {


    /**
     * 递归解法
     *
     * @param head
     * @return
     */
    public ListNode reserveLinkedList(ListNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        ListNode newHead = reserveLinkedList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }

    /**
     * 非递归解法
     *
     * @param head
     * @return
     */

    public ListNode reserveLinkedListNotRecursive(ListNode head) {

        ListNode previous = null;
        ListNode current = head;


        while (current != null) {
            ListNode next = current.getNext();

            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        ListNode.printLinkedList(new LinkedListReserve().reserveLinkedList(ListNode.createLinkedList(new int[]{1, 2, 3, 4, 5})));
        ListNode.printLinkedList(new LinkedListReserve().reserveLinkedListNotRecursive(ListNode.createLinkedList(new int[]{1, 2, 3, 4, 5})));
    }
}
