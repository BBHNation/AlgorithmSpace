package com.algorithm.space.hancock.solution;

public class SolutionOf21 {
  public int[] exchange(int[] nums) {
    int evenIndex = 0;
    int oddIndex = nums.length - 1;
    while (evenIndex < oddIndex) {

      while (nums[evenIndex] % 2 != 0 && evenIndex < oddIndex) {
        evenIndex ++;
      }
      while (nums[oddIndex] % 2 != 1 && evenIndex < oddIndex) {
        oddIndex --;
      }

      if (nums[evenIndex] % 2 == 0 && nums[oddIndex] % 2 == 1) {
        int temp = nums[evenIndex];
        nums[evenIndex] = nums[oddIndex];
        nums[oddIndex] = temp;
      }
    }

    return nums;
  }
}
