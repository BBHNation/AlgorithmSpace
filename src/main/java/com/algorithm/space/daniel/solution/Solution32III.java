package com.algorithm.space.daniel.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution32III {
    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList();
        }
        LinkedList<TreeNode> queue = new LinkedList();
        List<List<Integer>> res = new ArrayList();
        queue.offer(root);
        while(!queue.isEmpty()){
            LinkedList<Integer> list = new LinkedList();
            int len = queue.size();
            for(int i = 0; i < len; i++){
                TreeNode node = queue.poll();
                //如果将要添加元素的层为奇数层，则进行尾插法，将结果按顺序在 list 尾部进行插入
                //如果将要添加元素的层为偶数层，则进行头插法，将结果按顺序在 list 头部进行插入
                if(res.size() % 2 == 0){
                    list.addLast(node.val);
                }else{
                    list.addFirst(node.val);
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
