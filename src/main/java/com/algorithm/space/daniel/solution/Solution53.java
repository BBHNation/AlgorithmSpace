package com.algorithm.space.daniel.solution;

public class Solution53 {
    public int search(int[] nums, int target) {
        //target的右边界 - （target-1）的右边界 = target的个数
        return findborder(nums,target) - findborder(nums, target - 1);
    }

    public int findborder(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(nums[mid] <= target ){
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return l;
    }
}
