package com.algorithm.space.hancock.all.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionOf0047Test {
    @Test
    void permuteUnique_shouldReturnAll_givenArray() {
        // given
        int[] nums = {1, 1, 2};

        // when
        List<List<Integer>> lists = new SolutionOf0047().permuteUnique(nums);

        // then
        Assertions.assertThat(lists.size()).isEqualTo(4);
    }
}