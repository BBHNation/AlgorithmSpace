package com.algorithm.space.solution;

public class BinaryConverseDecimal {
    public boolean binaryConverse(String num, int divisible){
        int res;
            res =  Integer.parseInt(num,2);
            if(res % divisible == 0){
                return true;
            }
            else{
                return false;
            }
    }
}
