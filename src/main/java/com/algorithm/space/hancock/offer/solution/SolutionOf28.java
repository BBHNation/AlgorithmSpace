package com.algorithm.space.hancock.offer.solution;

import com.algorithm.space.hancock.common.TreeNode;

public class SolutionOf28 {
  public boolean isSymmetric(TreeNode root) {
    return isSymmetric(root, root);
  }

  public boolean isSymmetric(TreeNode leftRoot, TreeNode rightRoot) {
    if (leftRoot == null && rightRoot == null) return true;
    if (leftRoot == null || rightRoot == null || leftRoot.val != rightRoot.val) return false;
    return isSymmetric(leftRoot.left, rightRoot.right) && isSymmetric(leftRoot.right, rightRoot.left);
  }

}
