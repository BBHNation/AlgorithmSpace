package main.java.com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    @Test
    void spiralOrder_should123698745_give123_456_789() {
        //given
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] ans = {1,2,3,6,9,8,7,4,5};
        Solution29 solution29 = new Solution29();
        //when
        int[] res = solution29.spiralOrder(matrix);
        //then
        Assertions.assertEquals(ans,res);
    }
}