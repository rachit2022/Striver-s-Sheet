package com.striver.java.sorting;

import java.util.Arrays;

public class InsertionSortRecursion {

    public static int[] insertionSort(int[] arr, int i, int n) {
        if (n == 1) {
            return arr;
        }
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        return insertionSort(arr, i + 1, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 6, 7 };
        System.out.println(Arrays.toString(insertionSort(arr, 0, arr.length)));
    }
}
