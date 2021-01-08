package com.algorithm.space.solution;

import com.algorithm.space.solution.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf24Test {
  @Test
  void reverseList_shouldReturn54321_given12345() {
    // given
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    // when
    ListNode pointer = new SolutionOf24().reverseList(node1);

    // then
    int expected = 5;
    while (pointer != null) {
      Assertions.assertEquals(expected--, pointer.val);
      pointer = pointer.next;
    }
  }
}