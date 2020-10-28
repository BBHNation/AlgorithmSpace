package com.algorithm.space.daniel.solution;

public class Solution39 {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = nums[0];
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count = num == candidate ? count + 1 : count - 1;
        }
        return candidate;
    }
}
