package com.algorithm.space.hancock.solution;

import com.algorithm.space.hancock.solution.common.ListNode;

public class SolutionOf24 {
  public ListNode reverseList(ListNode head) {
    ListNode preNode = null;
    ListNode curNode = head;

    while (curNode != null) {
      ListNode temp = curNode.next;
      curNode.next = preNode;

      preNode = curNode;
      curNode = temp;
    }

    return preNode;
  }
}
