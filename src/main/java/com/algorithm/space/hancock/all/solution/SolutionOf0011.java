package com.algorithm.space.hancock.all.solution;

public class SolutionOf0011 {

    public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;

        while (leftPointer < rightPointer) {
            int leftHeight = height[leftPointer];
            int rightHeight = height[rightPointer];
            int area = Math.min(leftHeight, rightHeight) * (rightPointer - leftPointer);
            maxArea = Math.max(area, maxArea);

            if (leftHeight < rightHeight) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }

        return maxArea;
    }

}
