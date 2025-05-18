package com.striver.java.arrays;

public class LargestElement {

    public static int largestElement(int[] arr, int largestNumberIndex, int n) {
        if (n == 1) {
            return arr[largestNumberIndex];
        }
        if (arr[largestNumberIndex] < arr[largestNumberIndex + 1]) {
            largestNumberIndex = largestNumberIndex + 1;
        }
        return largestElement(arr, largestNumberIndex, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 8, 10, 5, 7, 9 };
        System.out.println(largestElement(arr, 0, arr.length));
    }
}
