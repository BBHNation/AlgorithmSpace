package com.algorithm.space.hancock.all.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf0912Test {
    @Test
    void sortArray_shouldReturn1235_given5231() {
        // given
        int[] nums = {5, 2, 3, 1};

        // when
        int[] sortArray = new SolutionOf0912().sortArray(nums);

        // then
        Assertions.assertThat(sortArray).isEqualTo(new int[]{1, 2, 3, 5});
    }
}