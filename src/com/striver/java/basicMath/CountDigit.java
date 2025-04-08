package com.striver.java.basicMath;

import java.util.Scanner;

public class CountDigit {
    public static int countDigits(int n) {
        // Write your code here.
        int count = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            if (rem != 0 && n % rem == 0) {
                count++;
            }
            temp = temp / 10;
        }
        return count;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
        sc.close();

    }
}
