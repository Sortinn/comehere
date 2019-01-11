package problems.leetcode.loop;

import practice.datastructure.linkedList.ListNode;
import practice.datastructure.linkedList.LinkedListCreator;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedListDelete {

  public ListNode deleteIfEquals(ListNode head, int val) {
    while (head != null && head.getValue() == val) {
      head = head.getNext();
    }

    if (head == null) {
      return null;
    }

    ListNode prev = head;
    while (prev.getNext() != null) {
      if (prev.getNext().getValue() == val) {
        prev.setNext(prev.getNext().getNext());
      } else {
        prev = prev.getNext();
      }
    }
    return head;
  }

  public static void main(String[] args) {
    LinkedListDelete listDelete = new LinkedListDelete();
    LinkedListCreator listCreator = new LinkedListCreator();
    ListNode.printLinkedList(
      listDelete.deleteIfEquals(listCreator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5, 3, 3, 4)), 3));

    ListNode.printLinkedList(
      listDelete.deleteIfEquals(listCreator.createLinkedList(Arrays.asList(2, 3, 3, 4, 5, 3, 3, 4)), 2));

    ListNode.printLinkedList(
      listDelete.deleteIfEquals(listCreator.createLinkedList(Arrays.asList(2, 2, 2, 4, 5, 3, 3, 4)), 2));

    ListNode.printLinkedList(
      listDelete.deleteIfEquals(listCreator.createLinkedList(Arrays.asList(1)), 1));

    ListNode.printLinkedList(
      listDelete.deleteIfEquals(listCreator.createLinkedList(Arrays.asList(1)), 2));

    ListNode.printLinkedList(
      listDelete.deleteIfEquals(listCreator.createLinkedList(new ArrayList<>()), 3));
  }

}
