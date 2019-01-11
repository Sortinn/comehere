package comehere.problems.leetcode.linkedlist;

import comehere.practice.datastructure.linkedList.ListNode;

/**
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * <p>
 * 要求：说明：不允许修改给定的链表。
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        ListNode entrance = head;

        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if (fast == slow) {
                while (slow != entrance) {
                    slow = slow.getNext();
                    entrance = entrance.getNext();
                }
                return entrance;
            }
        }
        return null;
    }
}
