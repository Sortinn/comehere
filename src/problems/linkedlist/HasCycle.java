package problems.linkedlist;

import datastructure.linkedList.ListNode;


/**
 * 给定一个链表，判断链表中是否有环。
 * <p>
 * 不好写的地方：while循环的退出条件
 */


public class HasCycle {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        if (head == null || head.getNext() == null) {
            return true;
        }

        //循环判断条件
        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
//        node4.setNext(node1);
        System.out.println(new HasCycle().hasCycle(node1));
    }
}
