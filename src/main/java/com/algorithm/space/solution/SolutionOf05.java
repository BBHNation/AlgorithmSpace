package com.algorithm.space.solution;

public class SolutionOf05 {
  public String replaceSpace(String input) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int index = 0; index < input.length(); index++) {
      char c = input.charAt(index);
      if (c == ' ') {
        stringBuilder.append("%20");
      } else {
        stringBuilder.append(c);
      }
    }

    return stringBuilder.toString();
  }
}
