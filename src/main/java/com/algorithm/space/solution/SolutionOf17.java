package com.algorithm.space.solution;

public class SolutionOf17 {
  public int[] printNumbers(int n) {
    return getIntsWithSimpleWay(n);
  }

  String initStringNumber(int n) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int index = 0; index < n; index++) {
      stringBuilder.append("0");
    }
    return stringBuilder.toString();
  }

  private int[] getIntsWithSimpleWay(int n) {
    int maxNum = 1;
    for (int index = 0; index < n; index++) {
      maxNum *= 10;
    }

    int[] result = new int[maxNum-1];
    for (int index = 1; index < maxNum; index++) {
      result[index-1] = index;
    }

    return result;
  }
}
