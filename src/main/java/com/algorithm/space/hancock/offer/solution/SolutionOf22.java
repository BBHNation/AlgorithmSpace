package com.algorithm.space.hancock.offer.solution;

import com.algorithm.space.hancock.common.ListNode;

public class SolutionOf22 {
  public ListNode getKthFromEnd(ListNode head, int k) {
    ListNode fastPointer = head;
    ListNode slowPointer = head;
    for(int index = 0; index < k; index++) {
      if (fastPointer == null) {
        return null;
      }
      fastPointer = fastPointer.next;
    }

    while (fastPointer != null) {
      fastPointer = fastPointer.next;
      slowPointer = slowPointer.next;
    }

    return slowPointer;
  }
}
