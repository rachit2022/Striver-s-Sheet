package com.striver.java.basicRecursion;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] arr, int n) {
        reverseArr(arr, 0, n - 1);
    }

    public static void reverseArr(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            reverseArr(arr, start, end);
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int size = 5;
        reverse(array, size);
    }
}
