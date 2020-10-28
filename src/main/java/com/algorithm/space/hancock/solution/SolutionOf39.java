package com.algorithm.space.hancock.solution;

import java.util.HashMap;

public class SolutionOf39 {
  public int majorityElement(int[] nums) {
    return mapWay(nums);
  }

  private int mapWay(int[] nums) {
    HashMap<Integer, Integer> count = new HashMap<>();
    for (int num : nums) {
      count.merge(num, 1, Integer::sum);
      if (count.get(num) > nums.length / 2) {
        return num;
      }
    }
    return -1;
  }
}
