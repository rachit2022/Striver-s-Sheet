package com.striver.java.basicRecursion;

import java.util.Scanner;

public class FactorialN {
    public static int factorial(int n) {
        if (n == 1 || n==0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}
