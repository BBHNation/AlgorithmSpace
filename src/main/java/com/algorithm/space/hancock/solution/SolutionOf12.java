package com.algorithm.space.hancock.solution;

import java.util.Arrays;
import java.util.List;

public class SolutionOf12 {
    
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                if (depthFirstSearch(board, words, row, column, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean depthFirstSearch(char[][] board, char[] word, int row, int column, int index) {
        // 中断条件：边界超出，或者是当前字母不是期望的字母
        if (row < 0 || column < 0 || row >= board.length || column >= board[0].length || index >= word.length || word[index] != board[row][column]) {
            return false;
        } else if (index == word.length - 1) {
            return true;
        }

        // 走到这里就说明是已经相同了的，所以将本位置置为一个标记'/'，这样在后面的中断条件判断的时候，就不会重复
        board[row][column] = '/';

        // 然后开始按照顺序来做子查询（子图的深度优先遍历），按照上下左右的顺序进行
        Point left = new Point(row, column-1);
        Point right = new Point(row, column+1);
        Point top = new Point(row-1, column);
        Point bottom = new Point(row+1, column);
        List<Point> points = Arrays.asList(top, bottom, left, right);

        boolean exist = false;
        for (Point point : points) {
            exist |= depthFirstSearch(board, word, point.row, point.column, index+1);
        }

        if (!exist) {
            board[row][column] = word[index];
        }

        return exist;
    }

    private static class Point {

        int row;
        int column;

        Point(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }
}
