package com.algorithm.space.hancock.offer.solution;

import com.algorithm.space.hancock.offer.solution.common.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SolutionOf07Test {

    @Test
    void buildTree_shouldBuildSuccess_givenPreOrderOf3920157AndInOrderOf9315207() {
        // given
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};

        // when
        TreeNode actualRoot = new SolutionOf07().buildTree(preorder, inorder);

        // then
        TreeNode expectRoot = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        expectRoot.left = node9;
        expectRoot.right = node20;
        node20.left = node15;
        node20.right = node7;
        Assertions.assertThat(actualRoot).isEqualTo(expectRoot);
    }

    @Test
    void buildTree_shouldReturnNull_givenEmptyOrders() {
        // given
        int[] preorder = new int[]{};
        int[] inorder = new int[]{};

        // when
        TreeNode treeNode = new SolutionOf07().buildTree(preorder, inorder);

        // then
        Assertions.assertThat(treeNode).isNull();
    }
}