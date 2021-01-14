package com.algorithm.space.hancock.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf13Test {
    @Test
    void movingCount_shouldReturn3_givenRowIs2ColumnIs3MaxIs1() {
        testMovingCount(2, 3, 1, 3);
    }

    @Test
    void movingCount_shouldReturn1_givenRowIs3ColumnIs1MaxIs0() {
        testMovingCount(3, 1, 0, 1);
    }

    @Test
    void movingCount_shouldReturn6_givenRowIs3ColumnIs2MaxIs17() {
        testMovingCount(3, 2, 17, 6);
    }

    @Test
    void movingCount_shouldReturn15_givenRowIs16ColumnIs8MaxIs4() {
        testMovingCount(16, 8, 4, 15);
    }

    private void testMovingCount(int m, int n, int k, int expected) {
        // given when
        int movingCount = new SolutionOf13().movingCount(m, n, k);

        // then
        Assertions.assertThat(movingCount).isEqualTo(expected);
    }
}