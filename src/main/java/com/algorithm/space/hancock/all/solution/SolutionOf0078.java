package com.algorithm.space.hancock.all.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SolutionOf0078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        backTrack(0, nums, new LinkedList<>(), result);
        return result;
    }

    private void backTrack(int index, int[] nums, List<Integer> currentSet, List<List<Integer>> result) {
        // 默认添加
        result.add(new ArrayList<>(currentSet));
        // 循环处理所有余下的状态
        for (int i = index; i < nums.length; i++) {
            currentSet.add(nums[i]); // 先添加进来
            backTrack(i + 1, nums, currentSet, result); // 处理子问题
            currentSet.remove(currentSet.size() - 1);
        }
    }

}
