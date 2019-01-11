package problems.leetcode.linkedlist;

import practice.datastructure.linkedList.ListNode;

public class ReverseList {


    //  非递归
    public static ListNode reverse(ListNode head) {
        ListNode reverse = null;
        ListNode first = head;
        while (first != null) {
            ListNode second = first.getNext();
            first.setNext(reverse);
            reverse = first;
            first = second;
        }
        return reverse;
    }


    //  递归
    public static ListNode reverseRecursion(ListNode head) {
        if (head == null) return null;
        if (head.getNext() == null) return head;
        ListNode second = head.getNext();
        ListNode rest = reverseRecursion(second);
        second.setNext(head);
        head.setNext(null);
        return rest;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.createLinkedList(new int[]{1, 2, 3, 5, 4, 2, 4, 5});
//    ListNode newHead = reverse(head);
        ListNode newHead = reverseRecursion(head);
        ListNode.printLinkedList(newHead);


    }
}
