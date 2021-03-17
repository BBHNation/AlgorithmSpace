package com.algorithm.space.hancock.offer.solution;

import com.algorithm.space.hancock.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf18Test {
  @Test
  void deleteNode_shouldReturn412_given4152andDelete5() {
    // given
    ListNode node1 = new ListNode(4);
    ListNode node2 = new ListNode(1);
    ListNode node3 = new ListNode(5);
    ListNode node4 = new ListNode(2);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;

    // when
    ListNode newHead = new SolutionOf18().deleteNode(node1, 5);

    // then
    Assertions.assertEquals(4, newHead.val);
    Assertions.assertEquals(1, newHead.next.val);
    Assertions.assertEquals(2, newHead.next.next.val);
  }
}