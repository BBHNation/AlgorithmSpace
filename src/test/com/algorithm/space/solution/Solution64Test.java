package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution64Test {
    @Test
    void sumNums_should6_give3() {
        //given
        int i = 3;
        //when
        int sum = new Solution64().sumNums(i);
        //then
        Assertions.assertEquals(6, sum);
    }

    @Test
    void sumNums2_should6_give3() {
        //given
        int i = 3;
        //when
        int sum = new Solution64().sumNums2(i);
        //then
        Assertions.assertEquals(6, sum);
    }
}