package com.algorithm.space.hancock.offer.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf30Test {
  @Test
  void MinStackMin_shouldReturnNave3_given203() {
    // given
    SolutionOf30.MinStack minStack = new SolutionOf30.MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);

    // when
    int min = minStack.min();

    // then
    Assertions.assertEquals(-3, min);
  }

  @Test
  void MinStackMin_shouldReturn0_given010() {
    // given
    SolutionOf30.MinStack minStack = new SolutionOf30.MinStack();
    minStack.push(0);
    minStack.push(1);
    minStack.push(0);

    // when
    int firstMin = minStack.min();
    minStack.pop();
    int secondMin = minStack.min();

    // then
    Assertions.assertEquals(0, firstMin);
    Assertions.assertEquals(0, secondMin);
  }
}
