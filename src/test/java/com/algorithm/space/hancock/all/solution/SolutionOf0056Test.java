package com.algorithm.space.hancock.all.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf0056Test {
    @Test
    void merge() {
        // given
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        // when
        int[][] result = new SolutionOf0056().merge(intervals);

        // then
        Assertions.assertThat(result).isEqualTo(new int[][]{{1, 6}, {8, 10}, {15, 18}});
    }
}