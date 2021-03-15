package com.algorithm.space.hancock.offer.solution;

public class SolutionOf11 {
  public int minArrayRight(int[] numbers) {
    return minArrayRight(numbers, 0, numbers.length - 1);
  }

  /*
  right is right
   */
  private int minArrayRight(int[] numbers, int leftIndex, int rightIndex) {
    if (leftIndex >= rightIndex) {
      return numbers[leftIndex];
    }

    int midIndex = (leftIndex + rightIndex) / 2;
    if (numbers[midIndex] < numbers[rightIndex]) {
      // min num is in the Left
      return minArrayRight(numbers, leftIndex, midIndex);
    } else if (numbers[midIndex] > numbers[rightIndex]) {
      // min num is in the Right
      return minArrayRight(numbers, midIndex + 1, rightIndex);
    } else {
      return minArrayRight(numbers, leftIndex, rightIndex - 1);
    }
  }

  /*
  wrong
   */
  private int minArrayLeft(int[] numbers, int leftIndex, int rightIndex) {
    if (leftIndex >= rightIndex) {
      return numbers[leftIndex];
    }

    int midIndex = (leftIndex + rightIndex) / 2;
    if (numbers[midIndex] < numbers[leftIndex]) {
      // min num is in the Left
      return minArrayLeft(numbers, leftIndex, midIndex);
    } else if (numbers[midIndex] > numbers[leftIndex]) {
      // min num is in the Right
      return minArrayLeft(numbers, midIndex + 1, rightIndex);
    } else {
      return minArrayLeft(numbers, leftIndex, rightIndex-1);
    }
  }
}
