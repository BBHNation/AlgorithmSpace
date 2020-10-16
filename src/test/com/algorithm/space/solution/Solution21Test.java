package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution21Test {
    @Test
    void exchange_should135468_give143658() {
        //given
        int[] nums = {1,4,3,6,5,8};
        //when
        int[] res = new Solution21().exchange(nums);
        //then
        int[] ans = {1,5,3,6,4,8};
        Assertions.assertEquals(ans, res);
    }
}