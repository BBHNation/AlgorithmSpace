package com.algorithm.space.daniel.solution;

import java.util.LinkedList;

/**
 * 1. 滑动窗口产生的结果数组大小为 nums.length - k + 1
 * 2. 创建一个双端队列，并维护其单调递减性，来实现符合能求最大值的滑动窗口，注意这里队列中的元素是数组的索引
 * 3. 然后判断滑动窗口的队首是否过期，每一轮遍历过期的索引为i-k，当队首索引等于i-k说明队首已经过期
 * 4. 最后判断遍历的位置是否已经开始可以计入最大值，当遍历位置从k-1开始记录窗口最大值
 */
public class Solution59I {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k < 1){
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        //创建一个长度为k的双端队列作为滑动窗口
        LinkedList<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < nums.length; i++){
            //维护滑动窗口，保持其是单调递减的
            while(!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]){
                queue.pollLast();
            }
            queue.offerLast(i);
            //判断滑动窗口的头节点有没有过期，
            //当窗口队首等于当前遍历元素的索引与窗口大小的差值说明，窗口队首已过期
            if(queue.peekFirst() == (i-k)){
                queue.pollFirst();
            }
            //判断是否已经遍历到可以取最大值的位置，从i >= w-1开始
            if(i >= k - 1){
                res[index++] = nums[queue.peekFirst()];
            }
        }
        return res;
    }
}
