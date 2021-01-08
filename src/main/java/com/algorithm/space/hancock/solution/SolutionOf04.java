package com.algorithm.space.hancock.solution;

public class SolutionOf04 {
  public boolean findNumberIn2DArray(int[][] matrix, int target) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }

    int row = 0;
    int col = matrix[row].length - 1;

    while (row < matrix.length && col >= 0) {
      if (matrix[row][col] == target) {
        return true;
      } else if (matrix[row][col] > target) {
        col--;
      } else {
        row++;
      }
    }

    return false;
  }
}
