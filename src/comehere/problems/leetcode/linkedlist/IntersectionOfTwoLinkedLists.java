package comehere.problems.leetcode.linkedlist;

import comehere.practice.datastructure.linkedList.ListNode;


/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 * <p>
 * 例如，下面的两个链表：
 * <p>
 * A:          a1 → a2
 * ↘
 * c1 → c2 → c3
 * ↗
 * B:     b1 → b2 → b3
 * <p>
 * 在节点 c1 开始相交。
 * <p>
 * <p>
 * 注意：
 * 如果两个链表没有交点，返回 null.
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 */


/**
 * 思路：先比较两链表长度。
 * 在长链表上先提前走两链表结点差个步数。使得两链表在同一相对位置。
 * 接下来同时遍历两链表。如果两个链表有一个公共结点，那么该公共结点之后的所有结点都是重合的。
 * 如果碰到指向同一地址的结点，就说明找到了公共结点，返回该结点即可。
 * 如果直到两链表都遍历到null，也没找到指向同一地址的结点，那就返回null，说明没有公共结点。
 *
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode loopA = headA;
        ListNode loopB = headB;

        while (loopA != null) {
            lenA++;
            loopA = loopA.getNext();
        }

        while (loopB != null) {
            lenB++;
            loopB = loopB.getNext();
        }

        int diff = lenA - lenB;


        ListNode longHeadNode = null;
        ListNode shortHeadNode = null;

        if (diff > 0) {
            longHeadNode = headA;
            shortHeadNode = headB;
        } else {
            longHeadNode = headB;
            shortHeadNode = headA;
        }

        int i = 0;
        while (i++ < Math.abs(diff)) {
            longHeadNode = longHeadNode.getNext();
        }

        while (longHeadNode != shortHeadNode) {
            longHeadNode = longHeadNode.getNext();
            shortHeadNode = shortHeadNode.getNext();

        }
        return longHeadNode;
    }


}
