package com.algorithm.space.hancock.offer.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf29Test {
  @Test
  void spiralOrder_shouldReturn123698745_given123456789() {
    testSpiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5});
  }

  @Test
  void spiralOrder_shouldReturn123481211109567_given123456789101112() {
    testSpiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}, new int[]{1,2,3,4,8,12,11,10,9,5,6,7});
  }

  private void testSpiralOrder(int[][] matrix, int[] expected) {
    // given & when
    int[] spiralOrder = new SolutionOf29().spiralOrder(matrix);

    // then
    Assertions.assertThat(spiralOrder).isEqualTo(expected);
  }


}