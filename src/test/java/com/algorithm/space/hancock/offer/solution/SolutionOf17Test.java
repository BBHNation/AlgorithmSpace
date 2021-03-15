package com.algorithm.space.hancock.offer.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf17Test {
  @Test
  void printNumbers_shouldReturn0To999_givenInputIs3() {
    // given
    int n = 3;

    // when
    int[] ints = new SolutionOf17().printNumbers(n);

    // then
    for (int index = 1; index < 1000; index++) {
      Assertions.assertEquals(index, ints[index-1]);
    }
  }

  @Test
  void initStringNumber_shouldReturn000_givenInput3() {
    // given
    int n = 3;

    // when
    String number = new SolutionOf17().initStringNumber(n);

    // then
    Assertions.assertEquals("000", number);
  }
}