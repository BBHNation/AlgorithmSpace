package com.algorithm.space.hancock.all.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionOf0046Test {
    @Test
    void permute_shouldReturnAll_given123() {
        // given
        int[] nums = {1, 2, 3};

        // when
        List<List<Integer>> permute = new SolutionOf0046().permute(nums);

        // then
        Assertions.assertThat(permute).isEqualTo(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2), Arrays.asList(2, 1, 3), Arrays.asList(2, 3, 1), Arrays.asList(3, 2, 1), Arrays.asList(3, 1, 2)));
    }
}