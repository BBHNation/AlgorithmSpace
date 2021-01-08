package com.algorithm.space.hancock.solution;

import com.algorithm.space.hancock.solution.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf28Test {
  @Test
  void isSymmetric_shouldReturnTrue_given1223443() {
    // given
    TreeNode root = initTree();

    // when
    boolean isSymmetric = new SolutionOf28().isSymmetric(root);

    // then
    Assertions.assertTrue(isSymmetric);
  }

  private TreeNode initTree() {
    TreeNode one = new TreeNode(1);
    TreeNode two1 = new TreeNode(2);
    TreeNode two2 = new TreeNode(2);
    TreeNode three1 = new TreeNode(3);
    TreeNode three2 = new TreeNode(3);
    TreeNode four1 = new TreeNode(4);
    TreeNode four2 = new TreeNode(4);
    one.left = two1;
    one.right = two2;
    two1.left = three1;
    two1.right = four1;
    two2.left = four2;
    two2.right = three2;
    return one;
  }
}