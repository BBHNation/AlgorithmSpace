package com.algorithm.space.daniel.solution;

public class Solution21 {

    public int[] exchange(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start < end){
            while(start < end && (nums[start] % 2 != 0)){
                start++;
            }
            while(start < end && (nums[end] % 2 == 0)){
                end--;
            }
            swap(nums, start, end);
        }
        return nums;
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }


}
