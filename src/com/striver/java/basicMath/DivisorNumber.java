package com.striver.java.basicMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DivisorNumber {
    public static int[] divisors(int n) {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                list.add(i);
            }
            i++;
        }
        int[] arr = new int[list.size()];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = list.get(j);
        }
        return arr;

    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(divisors(n)));
        sc.close();
    }
}
