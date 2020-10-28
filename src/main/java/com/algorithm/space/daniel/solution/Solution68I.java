package com.algorithm.space.daniel.solution;

public class Solution68I {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(true){
            //如果根节点都小于p、q说明p、q都在root的右子树上
            if(root.val < p.val && root.val < q.val){
                root = root.right;
            }
            //如果根节点都大于p、q说明p、q都在root的左子树上
            else if(root.val > p.val && root.val > q.val){
                root = root.left;
            }else{
                //包含：root.val == p.val，root.val == q.val，root.val > p.val && root.val < q.val 或者 root.val < p.val && root.val > q.val，
                return root;
            }
        }
    }
}
