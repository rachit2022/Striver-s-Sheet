package com.striver.java.basicMath;

import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int n) {
        int size = 0;
        int temp = n;
        while (temp > 0) {
            size++;
            temp = temp / 10;
        }
        temp = n;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + (int) Math.pow(rem, size);
            temp = temp / 10;
        }

        return n == sum;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
    }
}
