package com.algorithm.space.hancock.solution;

public class SolutionOf15 {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    // (n & 1 == 1) => (n ends with 1)
    int weight = 0;
    while (n != 0) {
      weight += n & 1;
      n = n >>> 1;
    }
    return weight;
  }

  private int hammingWeightWithStream(int n) {
    return (int) Integer.toBinaryString(n).chars().filter(c -> c == 49).count();
  }
}
