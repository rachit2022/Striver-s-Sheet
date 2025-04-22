package com.striver.java.sorting;

import java.util.Arrays;

public class BubbleSortRecursion {

    public static int[] bubbleSort(int[] arr, int n) {

        if (n == 1) {
            return arr;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return bubbleSort(arr, n - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 6, 7 };
        System.out.println(Arrays.toString(bubbleSort(arr, arr.length)));
    }
}
