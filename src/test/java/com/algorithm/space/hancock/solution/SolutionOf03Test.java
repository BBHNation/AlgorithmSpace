package com.algorithm.space.hancock.solution;

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

  @Test
  void findRepeatNumber__shouldReturn11_given012345678910111211() {
    // given
    int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 11};

    // when
    int repeatNumber = new SolutionOf03().findRepeatNumber(nums);

    // then
    Assertions.assertEquals(11, repeatNumber);
  }
}