package com.algorithm.space.solution;

public class QuickSort {
    public int[] quickSort(int[] arr){
        if(arr == null || arr.length < 2){
           return arr;
        }
        int l = 0, r = arr.length-1;
        return process(arr,l, r);
    }

    public int[] process(int[] arr, int l, int r){
        if(l < r){
            swap(arr, l +(int)Math.random()*(r-l+1), r);
            int [] p = partition(arr, l, r);
            process(arr, l,p[0] - 1);
            process(arr,p[1] + 1, r);
        }
        return arr;
    }

    public int[] partition(int[] arr, int l, int r){
        int less = l - 1;
        int more = r;
        while(l < more){
            if(arr[l] < arr[r]){
                swap(arr, ++less, l++);
            }else if(arr[l] > arr[r]){
                swap(arr, --more, l);
            }else{
                l++;
            }
        }
        swap(arr, more, r);
        return new int[] {less + 1, more};
    }

    public void swap(int[] arr, int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}
