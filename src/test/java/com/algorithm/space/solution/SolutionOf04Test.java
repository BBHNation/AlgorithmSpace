package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf04Test {
  @Test
  void findNumberIn2DArray_shouldReturnTrue_givenFineInTheMatrix() {
    // given
    int[][] matrix = {
      {1, 4, 7, 11, 15},
      {2, 5, 8, 12, 19},
      {3, 6, 9, 16, 22},
      {10, 13, 14, 17, 24},
      {18, 21, 23, 26, 30}
    };

    // when
    boolean numberIn2DArray = new SolutionOf04().findNumberIn2DArray(matrix, 5);

    // then
    Assertions.assertTrue(numberIn2DArray);
  }

  @Test
  void findNumberIn2DArray_shouldReturnFalse_givenEmptyMatrix() {
    // given
    int[][] matrix = {};

    // when
    boolean numberIn2DArray = new SolutionOf04().findNumberIn2DArray(matrix, 0);

    // then
    Assertions.assertFalse(numberIn2DArray);
  }

  @Test
  void findNumberIn2DArray_shouldReturnFalse_given20NotInTheMatrix() {
    // given
    int[][] matrix = {
        {1, 4, 7, 11, 15},
        {2, 5, 8, 12, 19},
        {3, 6, 9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}
    };

    // when
    boolean numberIn2DArray = new SolutionOf04().findNumberIn2DArray(matrix, 20);

    // then
    Assertions.assertFalse(numberIn2DArray);
  }

  @Test
  void findNumberIn2DArray_shouldReturnTrue_given19InTheMatrix() {
    // given
    int[][] matrix = {
        {1,2,3,4,5},
        {6,7,8,9,10},
        {11,12,13,14,15},
        {16,17,18,19,20},
        {21,22,23,24,25}
    };

    // when
    boolean numberIn2DArray = new SolutionOf04().findNumberIn2DArray(matrix, 19);

    // then
    Assertions.assertTrue(numberIn2DArray);
  }
}
