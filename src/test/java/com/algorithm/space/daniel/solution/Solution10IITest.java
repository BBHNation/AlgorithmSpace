package com.algorithm.space.daniel.solution;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution10IITest {
    @Test
    void numWays_shouldReturn2_givenNumberInputIs2() {
        testNumWays(2, 2);
    }

    @Test
    void numWays_shouldReturn21_givenNumberInputIs7() {
        testNumWays(7, 21);
    }

    private void testNumWays(int n, int expected) {
        // given & whenR
        int numWays = new Solution10II().numWays(n);

        // then
        Assertions.assertThat(numWays).isEqualTo(expected);
    }

}