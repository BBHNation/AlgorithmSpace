package com.algorithm.space.solution;

import java.util.HashSet;

public class SolutionOf03 {
  public int findRepeatNumber(int[] nums) {
    for (int index = 0; index < nums.length; index++) {
      while (nums[index] != index) {
        /*
        if exchange numbers equal, finding the result
         */
        if (nums[index] == nums[nums[index]]) {
          return nums[index];
        }
        int temp = nums[index];
        nums[index] = nums[temp]; // temp must <= (n - 1)
        nums[temp] = temp;
      }
    }
    return -1;
  }

  private int findRepeatNumberWithHashSet(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) {
        return num;
      } else {
        set.add(num);
      }
    }
    return -1;
  }
}
