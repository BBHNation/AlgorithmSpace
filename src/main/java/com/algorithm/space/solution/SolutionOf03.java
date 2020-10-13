package com.algorithm.space.solution;

import java.util.HashSet;

public class SolutionOf03 {
  public int findRepeatNumber(int[] nums) {
    return 2;
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

