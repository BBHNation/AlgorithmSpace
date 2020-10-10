package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOfJz5Test {

  @Test
  void push_shouldPushSuccess_whenPushing() {
    // given
    int node = 1;
    SolutionOfJz5 solutionOfJz5 = new SolutionOfJz5();

    // when
    solutionOfJz5.push(node);

    // then
    Assertions.assertTrue(true);
  }

  @Test
  void pop_shouldPop1_whenPushed123() {
    // given
    int first = 1;
    int second = 2;
    int third = 3;
    SolutionOfJz5 solutionOfJz5 = new SolutionOfJz5();
    solutionOfJz5.push(first);
    solutionOfJz5.push(second);
    solutionOfJz5.push(third);

    // when
    int pop = solutionOfJz5.pop();

    // then
    Assertions.assertEquals(first, pop);
  }
}
