package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    void bubbleSort_should123456789_give987654321() {
        //given
        int[] arr = {9,8,7,6,5,4,3,2,1};
        //when
        int[] res = new BubbleSort().bubbleSort(arr);
        int[] ans = {1,2,3,4,5,6,7,8,9};
        Assertions.assertEquals(res,ans);
        //then
    }
}