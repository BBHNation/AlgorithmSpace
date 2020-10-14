package com.algorithm.space.solution;

public class Solution10I {
        public int fib(int N) {
            if(N <= 1){
                return N;
            }
            return fib_N(N);
        }
        public int fib_N(int N){
            int[] cache = new int[N+1];
            cache[1] = 1;
            for(int i = 2; i <= N; i++){
                cache[i] = cache[i - 1] + cache[i - 2];
            }
            return cache[N];
        }
}
