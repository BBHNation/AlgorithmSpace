package com.algorithm.space.daniel.solution;


import java.util.ArrayList;

public class Solution29 {
    public ArrayList<Integer> res = new ArrayList();
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        int size = matrix.length * matrix[0].length;
        int[] result = new int[size];
        int tr = 0, tc = 0;
        int dr = matrix.length - 1, dc = matrix[0].length - 1;
        while(tr <= dr && tc <= dc){
            printEdge(matrix, tr++, tc++, dr--, dc--);
        }
        for(int i = 0; i < size; i++){
            result[i] = res.get(i);
        }
        return result;
    }

    public void printEdge(int[][] matrix, int tr, int tc, int dr, int dc){
        if(tr == dr){
            for(int cur = tc; cur <= dc; cur++){
                res.add(matrix[tr][cur]);
            }

        }else if(tc == dc){
            for(int cur = tr; cur <= dr; cur++){
                res.add(matrix[cur][tc]);
            }
        }else{
            int curC = tc;
            int curR = tr;
            while(curC != dc){
                res.add(matrix[tr][curC]);
                curC++;
            }
            while(curR != dr){
                res.add(matrix[curR][dc]);
                curR++;
            }
            while(curC != tc){
                res.add(matrix[dr][curC]);
                curC--;
            }
            while(curR != tr){
                res.add(matrix[curR][tc]);
                curR--;
            }
        }
    }
}
