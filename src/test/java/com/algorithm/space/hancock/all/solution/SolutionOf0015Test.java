package com.algorithm.space.hancock.all.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SolutionOf0015Test {
    @Test
    void threeSum_shouldReturnTwoValidSumLists_givenOneSumList() {
        // given
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

        // when
        List<List<Integer>> lists = new SolutionOf0015().threeSum(nums);

        // then
        Assertions.assertThat(lists.size()).isEqualTo(2);
        Assertions.assertThat(lists.get(0)).isEqualTo(Arrays.asList(-1, -1, 2));
        Assertions.assertThat(lists.get(1)).isEqualTo(Arrays.asList(-1, 0, 1));

    }
}