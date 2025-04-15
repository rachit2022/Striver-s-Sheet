package com.striver.java.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] arr){
        for (int i = 0; i <= arr.length-1; i++) {
            int j=i;
            while (j>0 && arr[j-1]>arr[j]) { 
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] agrs) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
