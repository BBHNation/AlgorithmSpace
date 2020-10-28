package com.algorithm.space.daniel.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution32II {
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
            ArrayList<Integer> level = new ArrayList();
            int length = queue.size();
            for(int i = 0; i < length; i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}
