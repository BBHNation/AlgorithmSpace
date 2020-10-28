package com.algorithm.space.daniel.solution;

public class BubbleSort {
    public int[] bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return arr;
        }
        for(int end = arr.length - 1; end > 0; end--){
            for(int i = 0; i < end; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
        return arr;
    }

    private void swap(int[] arr, int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}
