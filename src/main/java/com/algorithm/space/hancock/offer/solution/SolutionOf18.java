package com.algorithm.space.hancock.offer.solution;

import com.algorithm.space.hancock.common.ListNode;

public class SolutionOf18 {
  public ListNode deleteNode(ListNode head, int val) {
    ListNode pHead = new ListNode(-1);
    pHead.next = head;

    ListNode fastPointer = head;
    ListNode slowPointer = pHead;

    while (fastPointer != null) {
      if (fastPointer.val == val) {
        slowPointer.next = fastPointer.next;
        break;
      }

      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next;
    }

    return pHead.next;
  }
}
