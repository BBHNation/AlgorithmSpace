package com.algorithm.space.hancock.offer.solution;

import java.util.Deque;
import java.util.LinkedList;

public class SolutionOf30 {
  private SolutionOf30() {}

  public static class MinStack {
    private final Deque<Integer> mainStack;
    private int minNum;

    /** initialize your data structure here. */
    public MinStack() {
      mainStack = new LinkedList<>();
      minNum = Integer.MAX_VALUE;
    }

    public void push(int x) {
      if (x <= minNum) {
        mainStack.push(minNum);
        minNum = x;
      }
      mainStack.push(x);
    }

    public void pop() {
      Integer pop = mainStack.pop();
      if (pop == minNum) {
        minNum = mainStack.pop();
      }
    }

    public int top() {
      return mainStack.peek();
    }

    public int min() {
      return minNum;
    }
  }
}
