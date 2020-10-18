package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode69Test {
    @Test
    void mySqrt_should_give() {
        //given
        int x = 10;
        float y = 0.01f;
        //when
        int res = new leetcode69().mySqrt_int(x);
        float res2 = new leetcode69().mySqrt_float(y);
        int ans = 3;
        System.out.println(res2);
        //then
        Assertions.assertEquals(res, ans);
    }

}