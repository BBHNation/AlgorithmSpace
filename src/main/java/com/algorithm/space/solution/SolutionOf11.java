package com.algorithm.space.solution;

public class SolutionOf11 {
  public int minArray(int[] numbers) {
    if (numbers.length == 0) {
      return 0;
    }

    int min = Integer.MAX_VALUE;
    for (int index : numbers) {
      if (min > index) {
        min = index;
      }
    }
    return min;
  }
}
