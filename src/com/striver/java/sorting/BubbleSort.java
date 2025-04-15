package com.striver.java.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] agrs) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
