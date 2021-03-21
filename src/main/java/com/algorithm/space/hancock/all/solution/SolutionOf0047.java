package com.algorithm.space.hancock.all.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SolutionOf0047 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        boolean[] vis = new boolean[nums.length];
        Arrays.sort(nums);

        backTrack(0, nums, vis, new ArrayList<>(), result);

        return result;
    }

    private void backTrack(int currentIndex, int[] nums, boolean[] vis, List<Integer> subResult, List<List<Integer>> result) {
        // base case
        if (currentIndex == nums.length) {
            result.add(new ArrayList<>(subResult));
            return;
        }

        // 其他情况
        for (int i = 0; i < nums.length; i++) {
            if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) continue;

            subResult.add(nums[i]);
            vis[i] = true;
            backTrack(currentIndex + 1, nums, vis, subResult, result);
            vis[i] = false;
            subResult.remove(subResult.size() - 1);
        }
    }

}
