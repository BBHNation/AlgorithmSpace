package com.algorithm.space.daniel.solution;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution32I {

     //Definition for a binary tree node.
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        //使用队列从左到右遍历二叉树的每一层节点
        LinkedList<TreeNode> queue = new LinkedList();
        ArrayList<Integer> res = new ArrayList();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            res.add(node.val);
            //如果有左子树，将左子树的节点加入队列
            if(node.left != null){
                queue.offer(node.left);
            }
            //如果有右子树，将右子树的节点加入队列
            if(node.right != null){
                queue.offer(node.right);
            }
        }
        int[] result = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }
}
