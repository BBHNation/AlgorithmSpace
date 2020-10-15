package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {
    @Test
    void majorityElement_should2_give12222738() {
        //given
        int[] nums = {1,2,2,2,2,7,3,8};
        //when
        int res = new Solution39().majorityElement(nums);
        //then
        Assertions.assertEquals(2,res);
    }
}