package com.algorithm.space.hancock.offer.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf14IITest {

    @Test
    void cuttingRope_shouldReturn18_givenInputIs8() {
        testCuttingRope(8, 18);
    }

    @Test
    void cuttingRope_shouldReturn36_givenInputIs10() {
        testCuttingRope(10, 36);
    }

    @Test
    void cuttingRope_shouldReturn727011288_givenInputIs120() {
        testCuttingRope(120, 953271190);
    }


    private void testCuttingRope(int input, int expected) {
        // given
        int n = input;

        // when
        int cuttingRope = new SolutionOf14II().cuttingRope(n);

        // then
        Assertions.assertThat(cuttingRope).isEqualTo(expected);
    }
}