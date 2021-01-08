package com.algorithm.space.hancock.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf15Test {
  @Test
  void hammingWeight_shouldReturn2_givenInput2() {
    // given
    int n = 9;

    // when
    int hammingWeight = new SolutionOf15().hammingWeight(n);

    // then
    int expected = 2;
    Assertions.assertThat(hammingWeight).isEqualTo(expected);
  }
}