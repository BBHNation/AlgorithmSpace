package com.algorithm.space.hancock.all.solution;

import java.util.Random;

public class SolutionOf0912 {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int start, int end) {
        if (start > end) return; // 中断条件是当无法切分数组的时候

        int pivotIndex = new Random().nextInt(end - start + 1) + start;
        swap(nums, pivotIndex, end); // 将中心数放到最后

        int pivot = nums[end]; // 中心位的数值大小
        int splitIndex = start;
        for (int j = start; j < end; j++) {
            if (nums[j] < pivot) {
                swap(nums, splitIndex, j);
                splitIndex++;
            }
        }

        swap(nums, end, splitIndex);

        quickSort(nums, start, splitIndex - 1);
        quickSort(nums, splitIndex + 1, end);
    }

    private void swap(int[] nums, int sourceIndex, int targetIndex) {
        int temp = nums[sourceIndex];
        nums[sourceIndex] = nums[targetIndex];
        nums[targetIndex] = temp;
    }
}
