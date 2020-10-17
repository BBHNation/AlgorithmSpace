package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryConverseDecimalTest {
    @Test
    void converse_should7_give111() {
        //given
        String num = "111";
        int n = 2;
        //when
        boolean res = new BinaryConverseDecimal().binaryConverse(num,n);
        //then
        Assertions.assertTrue(res);
    }
}