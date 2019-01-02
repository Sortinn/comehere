package problems.linkedlist;

import datastructure.linkedList.ListNode;

public class RotateList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */

    /**
     * 使用环形链表的思路，将所给链表首尾相接，遍历链表找到链表新的头结点和尾节点，将尾节点置空，返回头结点。
     */


    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode lenNode = head;
        ListNode headNode = head;
        int length = 0;

        //获取链表长度
        while (lenNode.getNext() != null) {
            lenNode = lenNode.getNext();
            length++;
        }
        length += 1;

        //如果 k 大于链表长度，对 k 取余进行计算
        if (k > length) {
            int ka = k % length;
            return rotateRight(head, ka);
        }


        //lenNode目前已经是链表的尾节点，将其指向头结点
        lenNode.setNext(headNode);

        //找到新的头结点
        ListNode newHeadNode = head;
        for (int j = 0; j < length - k; j++) {
            newHeadNode = newHeadNode.getNext();
        }

        //新的尾节点
        ListNode newTailNode = newHeadNode;
        for (int z = 0; z < length - 1; z++) {
            newTailNode = newTailNode.getNext();
        }

        //将尾节点置空
        newTailNode.setNext(null);
        return newHeadNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(new int[]{0, 1, 2, 32, 21, 4, 3});
        System.out.println(new RotateList().rotateRight(head, 4));
    }
}
