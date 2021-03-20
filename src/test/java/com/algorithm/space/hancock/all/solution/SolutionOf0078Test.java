package com.algorithm.space.hancock.all.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionOf0078Test {
    @Test
    void subsets_shouldReturnAll_givenString() {
        // given
        int[] nums = {1, 2, 3};

        // when
        List<List<Integer>> subsets = new SolutionOf0078().subsets(nums);

        // then
        Assertions.assertThat(subsets.size()).isEqualTo(8);
    }
}