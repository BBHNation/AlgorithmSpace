package com.algorithm.space.hancock.all.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SolutionOf0056 {

    public int[][] merge(int[][] intervals) {
        // 先进行排序
        Arrays.sort(intervals, Comparator.comparingInt(l -> l[0]));

        // 遍历每一个排序好的分段
        List<int[]> result = new ArrayList<>();
        for (int index = 0; index < intervals.length; index++) {
            int left = intervals[index][0];
            int right = intervals[index][1];

            if (result.isEmpty() || result.get(result.size() - 1)[1] < left) {
                result.add(intervals[index]);
            } else {
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], right);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

}
