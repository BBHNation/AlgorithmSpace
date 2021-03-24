package com.algorithm.space.hancock.all.solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionOf0215 {

    public int findKthLargest(int[] nums, int k) {
        List<Integer> integers = Arrays.stream(nums).boxed().sorted((l, r) -> r - l).collect(Collectors.toList());
        return integers.get(k - 1);
    }

}
