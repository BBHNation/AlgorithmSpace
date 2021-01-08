package com.algorithm.space.solution;

import com.algorithm.space.solution.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionOf27Test {
  @Test
  void mirrorTree_shouldReturnMirrorTreeRoot_givenTreeRoot() {
    // given
    TreeNode originTree = originTree();

    // when
    TreeNode mirrorTree = new SolutionOf27().mirrorTree(originTree);

    // then
    Assertions.assertEquals(7, mirrorTree.left.val);
    Assertions.assertEquals(2, mirrorTree.right.val);

    Assertions.assertEquals(9, mirrorTree.left.left.val);
    Assertions.assertEquals(6, mirrorTree.left.right.val);

    Assertions.assertEquals(3, mirrorTree.right.left.val);
    Assertions.assertEquals(1, mirrorTree.right.right.val);
  }

  private TreeNode originTree() {
    TreeNode four = new TreeNode(4);
    TreeNode two = new TreeNode(2);
    TreeNode seven = new TreeNode(7);
    TreeNode one = new TreeNode(1);
    TreeNode three = new TreeNode(3);
    TreeNode six = new TreeNode(6);
    TreeNode nine = new TreeNode(9);
    four.left = two;
    four.right = seven;
    two.left = one;
    two.right = three;
    seven.left = six;
    seven.right = nine;
    return four;
  }
}
