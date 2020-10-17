package com.algorithm.space.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test
    void quickSort_should123456789_give987654321() {
        //given
        int[] arr = {13,32,42,24,12,3,131,5634,5,3423,55,5,33423,3,3,5};
        //when
        int[] res = new QuickSort().quickSort(arr);
        int[] ans = {1,2,3,4,5,6,7,8,9};
        //Assertions.assertEquals(res,ans);
        //then
        System.out.println(res);
    }
}