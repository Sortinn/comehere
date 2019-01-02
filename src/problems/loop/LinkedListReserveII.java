package problems.loop;

import datastructure.linkedList.ListNode;
import datastructure.linkedList.LinkedListCreator;

import java.util.Arrays;

public class LinkedListReserveII {
  public ListNode reserveBetween(ListNode head, int m, int n) {

    int listLen = 1;
    ListNode lHead = head;
    while (lHead.getNext() != null) {
      lHead = lHead.getNext();
      listLen++;
    }

    if (listLen < m) {
      return null;
    }
    if (m < 1 || n < 1) {
      return null;
    }

    if (m == n) {
      return head;
    }


    LinkedListReserve listReserve = new LinkedListReserve();
    ListNode newHead = head;
    ListNode lastHead;
    int i = 1;
    while (i < m) {
      newHead = newHead.getNext();
      i++;
    }
    lastHead = newHead;
    while (i < n) {
      lastHead = lastHead.getNext();
      i++;
    }
    ListNode prev = lastHead;
    lastHead = lastHead.getNext();
    prev.setNext(null);
    i = 1;


    ListNode reservedHead = listReserve.reserveLinkedList(newHead);

    ListNode loopListNode;

    if (m == 1) {
      loopListNode = reservedHead;
      head = reservedHead;
    } else {
      loopListNode = head;
      ListNode prevNewHead = head;
      while (i < m - 1) {
        prevNewHead = prevNewHead.getNext();
        i++;
      }
      prevNewHead.setNext(reservedHead);
    }

    while (loopListNode.getNext() != null) {
      loopListNode = loopListNode.getNext();
    }

    loopListNode.setNext(lastHead);

    return head;
  }

  public static void main(String[] args) {
    LinkedListReserveII listReserveII = new LinkedListReserveII();
    LinkedListCreator listCreator = new LinkedListCreator();
    ListNode.printLinkedList(listReserveII.reserveBetween(listCreator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5)), 3, 4));
  }
}
