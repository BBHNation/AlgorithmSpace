package main.java.com.algorithm.space.solution;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution59II {
    Queue<Integer> queue;
    Deque<Integer> deque;
    public Solution59II() {
        queue = new LinkedList<Integer>();
        deque = new LinkedList<Integer>();
    }

    public int max_value() {
        if(deque.isEmpty()){
            return -1;
        }
        return deque.peek();
    }

    public void push_back(int value) {
        //维护一个单调递减的双端队列，保证队首永远是max value
        //如果入队的元素大于双端队列队尾元素 则移除队尾元素
        //双端队列里保存的是阶段性最大值 维护单调队列要用while
        while(!deque.isEmpty() && value > deque.peekLast()){
            deque.pollLast();
        }
        deque.offerLast(value);
        queue.offer(value);
    }

    public int pop_front() {
        if(queue.isEmpty()){
            return -1;
        }
        int res = queue.poll();
        //如果基本队列和双端队列队首相同，则同时移除队首
        if(res == deque.peekFirst()){
            deque.pollFirst();
        }
        return res;
    }
}
