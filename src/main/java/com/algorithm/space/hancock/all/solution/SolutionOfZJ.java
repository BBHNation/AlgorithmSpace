package com.algorithm.space.hancock.all.solution;

import java.util.Arrays;

public class SolutionOfZJ {

    public int[] solution(int[] input) {

        for (int i = input.length - 1; i > 0; i--) {
            if (input[i] > input[i - 1]) {
                int targetIndex = i - 1;

                int biggerMinIndex = i;
                for (int j = i; j < input.length - 1; j++) {
                    if (input[j] < input[biggerMinIndex] && input[j] > input[targetIndex]) {
                        biggerMinIndex = j;
                    }
                }

                int temp = input[targetIndex];
                input[targetIndex] = input[biggerMinIndex];
                input[biggerMinIndex] = temp;

                Arrays.sort(input, targetIndex + 1, input.length);
                break;
            }
        }

        return input;
    }

}
