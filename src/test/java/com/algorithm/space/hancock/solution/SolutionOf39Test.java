package com.algorithm.space.hancock.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionOf39Test {
  @Test
  void majorityElement_shouldReturn2_given123222542() {
    // given
    int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};

    // when
    int num = new SolutionOf39().majorityElement(nums);

    // then
    Assertions.assertEquals(2, num);
  }
}