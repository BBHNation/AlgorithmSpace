package com.algorithm.space.hancock.all.solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionOf0015 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> sortedNums = Arrays.stream(nums).sorted().boxed().collect(Collectors.toList());

        List<List<Integer>> result = new LinkedList<>();

        for (int index = 0; index < sortedNums.size(); index++) {
            if (index > 0 && sortedNums.get(index).equals(sortedNums.get(index - 1))) {
                continue;
            }

            int pointerOne = index + 1;
            int pointerTwo = sortedNums.size() - 1;

            result.addAll(findThreeNumWithTwoPointers(sortedNums, index, pointerOne, pointerTwo));
        }

        return result;
    }

    private List<List<Integer>> findThreeNumWithTwoPointers(List<Integer> sortedNums, int index, int pointerOne, int pointerTwo) {
        List<List<Integer>> result = new LinkedList<>();

        while (pointerOne < pointerTwo) {
            if (pointerOne > index + 1 && sortedNums.get(pointerOne).equals(sortedNums.get(pointerOne - 1))) {
                pointerOne++;
                continue;
            }

            if (pointerTwo < sortedNums.size() - 1 && sortedNums.get(pointerTwo).equals(sortedNums.get(pointerTwo + 1))) {
                pointerTwo--;
                continue;
            }

            int sum = sortedNums.get(index) + sortedNums.get(pointerOne) + sortedNums.get(pointerTwo);

            if (sum > 0) {
                pointerTwo--;
            } else if (sum < 0) {
                pointerOne++;
            } else {
                result.add(Arrays.asList(sortedNums.get(index), sortedNums.get(pointerOne), sortedNums.get(pointerTwo)));
                pointerOne++;
                pointerTwo--;
            }
        }

        return result;
    }
}
