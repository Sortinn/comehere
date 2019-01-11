package problems.leetcode.linkedlist;

import practice.datastructure.linkedList.ListNode;

public class RemoveElements {

    //    非递归解法
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.setNext(head);

        ListNode prev = dummyHead;
        while (prev.getNext() != null) {
            if (prev.getNext().getValue() == val) {
                ListNode delNode = prev.getNext();
                prev.setNext(delNode.getNext());
                delNode.setNext(null);
            } else {
                prev = prev.getNext();
            }
        }
        return dummyHead.getNext();
    }

    //    递归解法
    public ListNode removeElementsRecursive(ListNode head, int val) {
        if (head == null) {
            return null;
        }
//        ListNode res = removeElementsRecursive(head.getNext(), val);
//        //如果头结点的值也是 val ，那么返回 head 后面的链表 res
//        if (head.getValue() == val) {
//            return res;
//        }else {
//            head.setNext(res);
//            return head;
//        }
        head.setNext(removeElementsRecursive(head.getNext(), val));
        return head.getValue() == val ? head.getNext() : head;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 6, 4, 5, 6};
        ListNode head = new ListNode(arr);
        System.out.println(head);
        ListNode res = new RemoveElements().removeElementsRecursive(head, 6);
        System.out.println(res);
    }
}
