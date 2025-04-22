package com.striver.java.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(temp, 0, arr, low, temp.length);

        System.out.println("After merging from " + low + " to " + high + ": " + Arrays.toString(temp));
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 6, 7 };
        mergeSort(arr, 0, arr.length - 1);
    }
}