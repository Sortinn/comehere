package comehere.problems.leetcode.loop;

import comehere.practice.datastructure.linkedList.ListNode;
import comehere.practice.datastructure.linkedList.LinkedListCreator;

import java.util.Arrays;

public class LinkedListReserve {
  public ListNode reserveLinkedList(ListNode head) {
    ListNode newHead = null;
    ListNode currentHead = head;

    while (currentHead != null) {
      ListNode next = currentHead.getNext();
      currentHead.setNext(newHead);
      newHead = currentHead;
      currentHead = next;
    }
    return newHead;
  }

  public static void main(String[] args) {
    LinkedListCreator listCreator = new LinkedListCreator();
    LinkedListReserve listReserve = new LinkedListReserve();
    System.out.println(listReserve.reserveLinkedList(listCreator.createLinkedList(Arrays.asList(1,2,3,4,5))).getValue());
  }
}
