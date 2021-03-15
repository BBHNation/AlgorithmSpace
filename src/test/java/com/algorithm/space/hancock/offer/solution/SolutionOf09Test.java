package com.algorithm.space.hancock.offer.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf09Test {

  @Test
  void push_shouldPushSuccess_whenPushing() {
    // given
    int node = 1;
    SolutionOf09 solutionOf09 = new SolutionOf09();

    // when
    solutionOf09.appendTail(node);

    // then
    Assertions.assertTrue(true);
  }

  @Test
  void pop_shouldPop1_whenPushed123() {
    // given
    int first = 1;
    int second = 2;
    int third = 3;
    SolutionOf09 solutionOf09 = new SolutionOf09();
    solutionOf09.appendTail(first);
    solutionOf09.appendTail(second);
    solutionOf09.appendTail(third);

    // when
    int head = solutionOf09.deleteHead();

    // then
    Assertions.assertEquals(first, head);
  }

  @Test
  void pop_shouldThrowException_whenQueueIsEmpty() {
    // given
    SolutionOf09 solutionOf09 = new SolutionOf09();

    // when
    int head = solutionOf09.deleteHead();

    // then
    Assertions.assertEquals(-1, head);
  }
}