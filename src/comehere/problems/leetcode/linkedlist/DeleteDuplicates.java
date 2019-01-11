package comehere.problems.leetcode.linkedlist;

import comehere.practice.datastructure.linkedList.LinkedListCreator;
import comehere.practice.datastructure.linkedList.ListNode;

import java.util.Arrays;

public class DeleteDuplicates {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode pHead = head;
    while (pHead != null) {
      ListNode next = pHead.getNext();
      if (next == null) {
        break;
      }
      while (pHead.getValue() == next.getValue()) {
        next = next.getNext();
        if (next == null) {
          break;
        }
      }
      pHead.setNext(next);
      pHead = next;
    }
    return head;
  }

  public static void main(String[] args) {
    LinkedListCreator creator = new LinkedListCreator();
    ListNode head = creator.createLinkedList(Arrays.asList(1, 1, 2, 3, 3));
    ListNode newHead = new DeleteDuplicates().deleteDuplicates(head);
    while (newHead != null) {
      System.out.print(newHead.getValue() + "->");
      newHead = newHead.getNext();
    }

  }
}
