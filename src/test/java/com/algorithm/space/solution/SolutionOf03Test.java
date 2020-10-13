package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

class SolutionOf03Test {

  @Test
  void findRepeatNumber_shouldReturn2or3_given2310253() {
    // given
    int[] nums = new int[]{2,3,1,0,2,5,3};

    // when
    int repeatNumber = new SolutionOf03().findRepeatNumber(nums);

    // then
    Assertions.assertTrue(new HashSet<>(Arrays.asList(2, 3)).contains(repeatNumber));
  }

}