package com.algorithm.space.hancock.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf21Test {
  @Test
  void exchange_shouldReturn132_given123() {
    // given
    int[] nums = {1, 2, 3};

    // when
    int[] exchanged = new SolutionOf21().exchange(nums);

    // then
    Assertions.assertThat(exchanged).containsExactly(1,3,2);
  }
}