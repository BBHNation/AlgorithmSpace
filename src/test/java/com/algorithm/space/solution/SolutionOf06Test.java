package com.algorithm.space.solution;

import com.algorithm.space.solution.common.ListNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf06Test {

  @Test
  void reversePrint_shouldReturn321_givenHeadOf1() {
    // given
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    node1.setNext(node2);
    node2.setNext(node3);

    // when
    int[] result = new SolutionOf06().reversePrint(node1);

    // then
    Assertions.assertThat(result).containsExactly(3,2,1);
  }
}
