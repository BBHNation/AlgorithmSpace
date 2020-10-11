package com.algorithm.space.solution;

public class SolutionOfJz6 {
  public int minNumberInRotateArray(int [] array) {
    if (array.length == 0) {
      return 0;
    }

    int min = Integer.MAX_VALUE;
    for (int index : array) {
      if (min > index) {
        min = index;
      }
    }
    return min;
  }
}
