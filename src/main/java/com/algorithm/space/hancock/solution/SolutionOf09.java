package com.algorithm.space.hancock.solution;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Your CQueue object will be instantiated and called as such: CQueue obj = new CQueue();
 * obj.appendTail(value); int param_2 = obj.deleteHead();
 */
class SolutionOf09 {

  private final Deque<Integer> stack1;
  private final Deque<Integer> stack2;

  public SolutionOf09() {
    stack1 = new LinkedList<>();
    stack2 = new LinkedList<>();
  }

  public void appendTail(int value) {
    stack1.push(value);
  }

  public int deleteHead() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }

    try{
      return stack2.pop();
    } catch (Exception e) {
      return -1;
    }
  }
}

