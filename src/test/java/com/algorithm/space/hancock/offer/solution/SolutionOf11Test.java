package com.algorithm.space.hancock.offer.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf11Test {

  @Test
  void minNumberInRotateArray_shouldReturn1_given456123() {
    // given
    int[] arr = new int[]{4,5,6,1,2,3};
    SolutionOf11 solutionOf11 = new SolutionOf11();

    // when
    int minNumber = solutionOf11.minArrayRight(arr);

    // then
    Assertions.assertEquals(1, minNumber);
  }

  @Test
  void minNumberInRotateArray_shouldReturn1_given45678123() {
    // given
    int[] arr = new int[]{4,5,6,7,8,1,2,3};
    SolutionOf11 solutionOf11 = new SolutionOf11();

    // when
    int minNumber = solutionOf11.minArrayRight(arr);

    // then
    Assertions.assertEquals(1, minNumber);
  }
}