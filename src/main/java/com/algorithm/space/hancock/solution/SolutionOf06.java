package com.algorithm.space.hancock.solution;

import com.algorithm.space.hancock.solution.common.ListNode;

public class SolutionOf06 {
  public int[] reversePrint(ListNode head) {
    int length = 0;
    ListNode pointer = head;
    while (pointer != null) {
      pointer = pointer.getNext();
      length ++;
    }

    int[] result = new int[length];
    pointer = head;
    while (pointer != null) {
      result[--length] = pointer.getVal();
      pointer = pointer.getNext();
    }

    return result;
  }
}
