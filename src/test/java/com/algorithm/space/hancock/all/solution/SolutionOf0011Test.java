package com.algorithm.space.hancock.all.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf0011Test {

    @Test
    void maxArea() {
        // given
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        // when
        int maxArea = new SolutionOf0011().maxArea(height);

        // then
        Assertions.assertThat(maxArea).isEqualTo(49);
    }
}