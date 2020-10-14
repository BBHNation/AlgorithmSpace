package com.algorithm.space.solution;

public class Solution10I {
        public int fib(int N) {
            int a = 0, b = 1, c = 0;
            if(N <= 1){
                return N;
            }
            else{
                for(int i = 2; i <= N; i++){
                    c = a + b;
                    a = b;
                    b = c;
                }
                return c;
            }
        }
}
