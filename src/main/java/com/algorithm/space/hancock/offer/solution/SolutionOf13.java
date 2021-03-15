package com.algorithm.space.hancock.offer.solution;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class SolutionOf13 {

    public int movingCount(int row, int column, int k) {
        LinkedList<Point> points = new LinkedList<>();
        points.add(new Point(0, 0));

        int movingCount = 0;
        boolean[][] visited = new boolean[row][column];

        while (!points.isEmpty()) {
            Point point = points.pop();
            if (point.getSum() <= k) {
                movingCount++;
                visited[point.row][point.column] = true;
            }

            // 这里满足条件的化需要在队列中加入后续的点
            if (point.row + 1 < row
                    && !visited[point.row + 1][point.column]
                    && !points.contains(new Point(point.row + 1, point.column))
                    && new Point(point.row + 1, point.column).getSum() <= k) {
                points.add(new Point(point.row + 1, point.column));
            }
            if (point.column + 1 < column
                    && !visited[point.row][point.column + 1]
                    && !points.contains(new Point(point.row, point.column + 1))
                    && new Point(point.row, point.column + 1).getSum() <= k) {
                points.add(new Point(point.row, point.column + 1));
            }
        }

        return movingCount;
    }

    private static class Point {
        int row;
        int column;

        Point(int row, int column) {
            this.row = row;
            this.column = column;
        }

        int getSum() {
            return convertToSingle(row) + convertToSingle(column);
        }

        private int convertToSingle(int origin) {
            List<Integer> singleNums = new LinkedList<>();
            while (origin >= 10) {
                singleNums.add(origin % 10);
                origin = origin / 10;
            }
            singleNums.add(origin);
            return singleNums.stream().reduce(0, Integer::sum);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return row == point.row && column == point.column;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, column);
        }
    }

}
