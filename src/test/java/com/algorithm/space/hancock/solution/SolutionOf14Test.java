package com.algorithm.space.hancock.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf14Test {
    @Test
    void cuttingRope_shouldReturn18_givenInputIs8() {
        testCuttingRope(8, 18);
    }

    @Test
    void cuttingRope_shouldReturn36_givenInputIs10() {
        testCuttingRope(10, 36);
    }

    private void testCuttingRope(int input, int expected) {
        // given
        int n = input;

        // when
        int cuttingRope = new SolutionOf14().cuttingRope(n);

        // then
        Assertions.assertThat(cuttingRope).isEqualTo(expected);
    }

}