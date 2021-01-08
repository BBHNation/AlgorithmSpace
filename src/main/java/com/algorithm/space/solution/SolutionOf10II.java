package com.algorithm.space.solution;

public class SolutionOf10II {
  public int numWays(int n) {
    if (n < 0) {
      return -1;
    }

    switch (n) {
      case 0:
      case 1:
        return 1;
      case 2:
        return 2;
      default:
        break;
    }

    int[] results = new int[n+1];
    results[0] = 0;
    results[1] = 1;
    results[2] = 2;
    for (int index = 3; index <= n; index++) {
      results[index] = (results[index-1] + results[index-2]) % 1000000007;
    }
    return results[n];
  }
}
