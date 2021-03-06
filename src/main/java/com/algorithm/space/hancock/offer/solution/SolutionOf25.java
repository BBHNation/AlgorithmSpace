package com.algorithm.space.hancock.offer.solution;

import com.algorithm.space.hancock.common.ListNode;

public class SolutionOf25 {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode preHead = new ListNode(-1);
    ListNode current = preHead;

    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        current.next = l1;
        l1 = l1.next;
      } else {
        current.next = l2;
        l2 = l2.next;
      }
      current = current.next;
    }

    current.next = l1 == null ? l2 : l1;
    return preHead.next;
  }
}
