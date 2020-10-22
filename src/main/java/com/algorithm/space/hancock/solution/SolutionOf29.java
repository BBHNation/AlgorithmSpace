package com.algorithm.space.hancock.solution;

public class SolutionOf29 {
  public int[] spiralOrder(int[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return new int[]{};
    }
    Point leftTop = new Point(0, 0);
    Point rightTop = new Point(matrix[0].length - 1, 0);
    Point leftBottom = new Point(0, matrix.length - 1);
    Point rightBottom = new Point(matrix[0].length - 1, matrix.length - 1);

    int[] result = new int[matrix.length * matrix[0].length];

    int pointer = 0;
    while (leftTop.x <= rightBottom.x && leftTop.y <= rightBottom.y) {
      pointer = printBorder(matrix, leftTop, rightTop, leftBottom, rightBottom, result, pointer);
      leftTop.moveRight().moveDown();
      rightTop.moveLeft().moveDown();
      leftBottom.moveUp().moveRight();
      rightBottom.moveUp().moveLeft();
    }
    return result;
  }

  private int printBorder(int[][] matrix, Point leftTop, Point rightTop, Point leftBottom, Point rightBottom, int[] result, int pointer) {
    for (int index = leftTop.x; index <= rightTop.x; index++) {
      result[pointer++] = matrix[leftTop.y][index];
    }
    for (int index = rightTop.y + 1; index <= rightBottom.y; index++) {
      result[pointer++] = matrix[index][rightTop.x];
    }
    if (rightBottom.y != leftTop.y) {
      for (int index = rightBottom.x - 1; index >= leftBottom.x; index--) {
        result[pointer++] = matrix[rightBottom.y][index];
      }
    }
    if (rightBottom.x != leftTop.x) {
      for (int index = leftBottom.y - 1; index > leftTop.y; index--) {
        result[pointer++] = matrix[index][leftBottom.x];
      }
    }
    return pointer;
  }

  private static class Point {
    int x;
    int y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    Point moveRight() {
      this.x++;
      return this;
    }

    Point moveLeft() {
      this.x--;
      return this;
    }

    Point moveUp() {
      this.y--;
      return this;
    }

    Point moveDown() {
      this.y++;
      return this;
    }
  }
}
