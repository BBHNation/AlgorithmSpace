package com.algorithm.space.solution;

import java.util.Stack;

public class SolutionOfJz5 {
  private final Stack<Integer> stack1 = new Stack<>();
  private final Stack<Integer> stack2 = new Stack<>();

  public void push(int node) {
    stack1.push(node);
  }

  public int pop() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }
    return stack2.pop();
  }
}
