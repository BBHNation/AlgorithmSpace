package com.algorithm.space.hancock.all.solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf0215Test {
    @Test
    void findKthLargest() {
        // given
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        // when
        int kthLargest = new SolutionOf0215().findKthLargest(nums, k);

        // then
        Assertions.assertThat(kthLargest).isEqualTo(5);
    }
}