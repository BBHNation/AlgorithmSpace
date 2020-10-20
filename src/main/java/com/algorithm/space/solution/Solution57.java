package com.algorithm.space.solution;

public class Solution57 {
    public int[] twoSum(int[] nums, int target) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     if(map.containsKey(Math.abs(target - nums[i]))){
        //         return new int[] {nums[i], nums[map.get(Math.abs(target - nums[i]))]};
        //     }
        //     map.put(nums[i], i);
        // }
        //使用双指针完成，因为数组是递增排序的，首先想到双指针或者二分
        int start = 0, end = nums.length - 1;
        int sum;
        while(start < end){
            sum = nums[start] + nums[end];
            if(sum < target){
                start++;
            }else if(sum > target){
                end--;
            }else{
                return new int[] {nums[start], nums[end]};
            }
        }
        return new int[0];
    }
}
