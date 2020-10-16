package com.algorithm.space.solution;

import java.util.HashMap;
import java.util.Map;

public class SolutionOf10 {
  Map<Integer, Integer> numberCount = new HashMap<>();

  public int fib(int n) {
    if (n < 0) {
      return -1;
    } else if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {

      int[] arr = new int[n + 1];
      arr[0] = 0;
      arr[1] = 1;
      for (int index = 2; index <= n; index++) {
        arr[index] = (arr[index - 1] + arr[index - 2]) % 1000000007;
      }
      return arr[n];

    }
  }

  private int fibWithRecursion(int n) {
    calculateCount(n);

    if (n <= 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }

  private void calculateCount(int n) {
    Integer count = numberCount.get(n);
    if (count == null) {
      count = 1;
      numberCount.put(n, count);
    } else {
      numberCount.put(n, ++count);
    }
  }
}
