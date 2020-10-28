package com.algorithm.space.daniel.solution;

public class Solution64 {
    public int sumNums(int n) {
        if(n < 1){
            return 0;
        }
        return n + sumNums(n-1);
    }

    public int sumNums2(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
