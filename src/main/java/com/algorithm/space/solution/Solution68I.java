package main.java.com.algorithm.space.solution;

public class Solution68I {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(true){
            if(root.val < p.val && root.val < q.val){
                root = root.right;
            }else if(root.val > p.val && root.val > q.val){
                root = root.left;
            }else if(root.val == p.val){
                return p;
            }else if(root.val == q.val){
                return q;
            }else{
                return root;
            }
        }
    }
}
