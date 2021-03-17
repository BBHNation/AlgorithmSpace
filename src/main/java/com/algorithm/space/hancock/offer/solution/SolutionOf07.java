package com.algorithm.space.hancock.offer.solution;

import com.algorithm.space.hancock.common.TreeNode;

import java.util.Arrays;

public class SolutionOf07 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length < 1 || inorder.length < 1) {
            return null;
        } else if (preorder.length != inorder.length) {
            return null;
        } else if (preorder.length == 1 && inorder.length == 1 && preorder[0] == inorder[0]) {
            return new TreeNode(preorder[0]);
        } else {
            TreeNode root = new TreeNode(preorder[0]);

            int leftTreeSize = 0;
            int rightTreeSize = 0;
            for (int index = 0; index < inorder.length; index++) {
                if (inorder[index] == preorder[0]) {
                    leftTreeSize = index;
                    rightTreeSize = inorder.length - index - 1;
                    break;
                }
            }

            if (leftTreeSize != 0) {
                int[] leftPreOrder = Arrays.copyOfRange(preorder, 1, leftTreeSize+1);
                int[] leftInOrder = Arrays.copyOfRange(inorder, 0, leftTreeSize);
                root.left = buildTree(leftPreOrder, leftInOrder);
            }

            if (rightTreeSize != 0) {
                int[] rightPreOrder = Arrays.copyOfRange(preorder, 1+leftTreeSize, 1+leftTreeSize+rightTreeSize);
                int[] rightInOrder = Arrays.copyOfRange(inorder, leftTreeSize+1, inorder.length);
                root.right = buildTree(rightPreOrder, rightInOrder);
            }

            return root;
        }
    }

}
