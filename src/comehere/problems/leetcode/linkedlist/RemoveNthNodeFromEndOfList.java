package comehere.problems.leetcode.linkedlist;

import comehere.practice.datastructure.linkedList.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode resListNode = new ListNode(0);     //哑结点

        resListNode.setNext(head);

         if(n == 0 || head == null){
             return head;
         }
         if(n == 1 && head.getNext() == null){
             return null;
         }

        ListNode pre = resListNode, after = resListNode;

        int i = 0;
        while (i++ < n) {
            pre = pre.getNext();
        }
        while (pre.getNext() != null) {
            after = after.getNext();
            pre = pre.getNext();
        }
        after.setNext(after.getNext().getNext());
        return resListNode.getNext();
    }
}
