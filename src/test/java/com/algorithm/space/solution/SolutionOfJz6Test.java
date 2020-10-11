package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOfJz6Test {

  @Test
  void minNumberInRotateArray_shouldReturn1_given456123() {
    // given
    int[] arr = new int[]{4,5,6,1,2,3};
    SolutionOfJz6 solutionOfJz6 = new SolutionOfJz6();

    // when
    int minNumber = solutionOfJz6.minNumberInRotateArray(arr);

    // then
    Assertions.assertEquals(1, minNumber);
  }
}