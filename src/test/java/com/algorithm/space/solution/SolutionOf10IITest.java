package com.algorithm.space.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf10IITest {
  @Test
  void numWays_shouldReturn2_givenNumberInputIs2() {
    testNumWays(2, 2);
  }

  @Test
  void numWays_shouldReturn21_givenNumberInputIs7() {
    testNumWays(7, 21);
  }

  private void testNumWays(int n, int expected) {
    // given & when
    int numWays = new SolutionOf10II().numWays(n);

    // then
    Assertions.assertThat(numWays).isEqualTo(expected);
  }
}