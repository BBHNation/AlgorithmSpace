package com.algorithm.space.hancock.solution;

import com.algorithm.space.hancock.solution.common.NotImplementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionOf07Test {

    @Test
    void buildTree_shouldThrowNotImplementException_givenNotImplemented() {
        // given
        int[] preorder = new int[0];
        int[] inorder = new int[0];

        // when
        NotImplementException exception = assertThrows(NotImplementException.class, () -> new SolutionOf07().buildTree(preorder, inorder));

        // then
        Assertions.assertNotNull(exception);
    }
}