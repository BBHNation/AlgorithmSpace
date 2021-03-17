package com.algorithm.space.hancock.offer.solution;

import com.algorithm.space.hancock.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf25Test {
  @Test
  void mergeTwoLists_shouldReturn112344_givenOneIs124OtherIs134() {
    // given
    ListNode firstList = firstList();

    ListNode secondList = secondList();

    // when
    ListNode pointer = new SolutionOf25().mergeTwoLists(firstList, secondList);

    // then
    int[] expected = new int[]{1,1,2,3,4,4};
    int index = 0;
    while (pointer != null) {
      Assertions.assertEquals(expected[index++], pointer.val);
      pointer = pointer.next;
    }
  }

  private ListNode secondList() {
    ListNode one = new ListNode(1);
    ListNode three = new ListNode(3);
    ListNode four = new ListNode(4);
    one.next = three;
    three.next = four;
    return one;
  }

  private ListNode firstList() {
    ListNode one = new ListNode(1);
    ListNode two = new ListNode(2);
    ListNode four = new ListNode(4);
    one.next = two;
    two.next = four;
    return one;
  }
}