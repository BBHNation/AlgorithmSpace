package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryConverseDecimalTest {
    @Test
    void converse_should7_give111() {
        //given
        String num = "111";
        //when
        int res = new BinaryConverseDecimal().binaryConverse(num);
        //then
        Assertions.assertEquals(7,res);
    }
}