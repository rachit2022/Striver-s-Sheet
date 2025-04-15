package com.striver.java.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int indexOfmin=i;
            int j=i+1;
            while(j<arr.length){
                if(arr[indexOfmin]>arr[j]){
                    indexOfmin=j;
                }
                j++;
            }
            int temp=arr[indexOfmin];
            arr[indexOfmin]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    public static void main(String[] agrs){
        int[] arr={13,46,24,52,20,9};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
