package com.algorithm.space.daniel.solution;

public class Solution66 {
        public int[] constructArr(int[] a) {
            int[] res = new int[a.length];
            int left = 1;
            for(int i = 0; i < a.length; i++ ){
                res[i] = left;
                left *= a[i];
            }
            int right = 1;
            for(int i = a.length - 1; i >= 0; i-- ){
                res[i] *= right;
                right *= a[i];
            }
            return res;
        }
}
