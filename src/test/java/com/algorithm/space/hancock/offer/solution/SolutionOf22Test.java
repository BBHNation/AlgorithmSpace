package com.algorithm.space.hancock.offer.solution;

import com.algorithm.space.hancock.offer.solution.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf22Test {
  @Test
  void getKthFromEnd_shouldReturn45_givenListIs12345Input2() {
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
    ListNode kthFromEnd = new SolutionOf22().getKthFromEnd(node1, 2);

    // then
    Assertions.assertEquals(4, kthFromEnd.val);
    Assertions.assertEquals(5, kthFromEnd.next.val);
  }
}