package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution10ITest {
    @Test
    void function_should_give() {
        //given
        int N = 2;
        Solution10I solution10I = new Solution10I();
        //when
        int res = solution10I.fib(N);
        //then
        Assertions.assertEquals(1, res);
    }
}