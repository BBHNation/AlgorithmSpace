package com.algorithm.space.hancock.all.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOfZJTest {

    @Test
    void solution() {
        // given
        int[] input = new int[]{1, 3, 4, 8, 7, 6, 9, 2, 3, 4, 3, 1, 5, 8, 6, 5, 3, 2};

        // when
        int[] solution = new SolutionOfZJ().solution(input);

        // then
        Assertions.assertThat(solution).isEqualTo(new int[]{1, 3, 4, 8, 7, 6, 9, 2, 3, 4, 3, 1, 6, 2, 3, 5, 5, 8});
    }
}