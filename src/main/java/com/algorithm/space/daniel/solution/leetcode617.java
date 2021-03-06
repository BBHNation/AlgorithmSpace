package com.algorithm.space.daniel.solution;

public class leetcode617 {
    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) {
              val = x;
          }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        TreeNode T = new TreeNode(t1.val + t2.val);
        T.left = mergeTrees(t1.left, t2.left);
        T.right = mergeTrees(t1.right, t2.right);
        return T;
    }
}
