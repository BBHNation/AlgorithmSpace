package com.algorithm.space.hancock.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf16Test {
    @Test
    void myPow_shouldReturn1024_givenInputIs2And10() {
        testMyPow(2.00000, 10, 1024.00000);
    }

    @Test
    void myPow_shouldReturn9Point261_givenInputIs2Point1And3() {
        testMyPow(2.10000, 3,9.26100);
    }

    @Test
    void myPow_shouldReturn0Point25_givenInputIs2AndNegative2() {
        testMyPow(2.00000, -2,0.25000);
    }

    @Test
    void myPow_shouldReturn0_givenInputIs2AndNegative2147483648() {
        testMyPow(2.00000, -2147483648,0);
    }

    private void testMyPow(double x, int n, double expected) {
        // given when
        double myPow = new SolutionOf16().myPow(x, n);

        // then
        Assertions.assertThat(myPow).isEqualTo(expected);
    }
}