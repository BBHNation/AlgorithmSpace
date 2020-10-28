package com.algorithm.space.daniel.solution;

public class BinaryConverseDecimal {
    public boolean binaryConverse(String num, int divisible){
        int res;
            res =  Integer.parseInt(num,divisible);
            if(res % divisible == 0){
                return true;
            }
            else{
                return false;
            }
    }
}
