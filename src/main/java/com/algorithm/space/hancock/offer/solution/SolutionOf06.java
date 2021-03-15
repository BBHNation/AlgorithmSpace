package com.algorithm.space.hancock.offer.solution;

import com.algorithm.space.hancock.offer.solution.common.ListNode;

public class SolutionOf06 {
  public int[] reversePrint(ListNode head) {
    int length = 0;
    ListNode pointer = head;
    while (pointer != null) {
      pointer = pointer.next;
      length ++;
    }

    int[] result = new int[length];
    pointer = head;
    while (pointer != null) {
      result[--length] = pointer.val;
      pointer = pointer.next;
    }

    return result;
  }
}
