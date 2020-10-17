package com.algorithm.space.solution;

public class BubbleSort {
    public int[] bubbleSort(int[] arr){
        if(arr == null || arr.length < 2){
            return arr;
        }
        for(int end = arr.length - 1; end > 0; end--){
            for(int i = 0; i < end; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i);
                }
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
}
