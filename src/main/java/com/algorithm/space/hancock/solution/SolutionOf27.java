package com.algorithm.space.hancock.solution;

import com.algorithm.space.hancock.solution.common.TreeNode;

public class SolutionOf27 {
  public TreeNode mirrorTree(TreeNode root) {
    recursionMirrorTree(root);
    return root;
  }

  public void recursionMirrorTree(TreeNode root) {
    if (root == null) {
      return;
    }

    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;

    recursionMirrorTree(root.left);
    recursionMirrorTree(root.right);
  }
}
