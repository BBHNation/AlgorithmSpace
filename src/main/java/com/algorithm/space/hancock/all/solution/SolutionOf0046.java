package com.algorithm.space.hancock.all.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SolutionOf0046 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> numList = new LinkedList<>();
        for (int num : nums) numList.add(num);
        backtrack(numList, 0, result);
        return result;
    }

    private void backtrack(List<Integer> numList, int index, List<List<Integer>> result) {
        // base case
        if (numList.size() == index) {
            result.add(new ArrayList<>(numList));
        }

        // 处理所有的可能
        for (int i = index; i < numList.size(); i++) {
            // 将后续所有的可能都放入index这个位置
            Collections.swap(numList, index, i);
            // 放好之后，再处理更深入的情况，也就是index+1的情况
            backtrack(numList, index + 1, result);
            // 这一种情况的index处理结束后，要回归到最初的处理index的时候的原始情况
            Collections.swap(numList, i, index);
        }
    }

}
