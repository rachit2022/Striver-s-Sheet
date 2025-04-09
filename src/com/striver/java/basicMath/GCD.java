package com.striver.java.basicMath;

import java.util.Scanner;

public class GCD {
    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int min = Math.min(n1, n2);

        for (int i = min; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;
            }
        }

        return gcd;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1, n2));
        sc.close();
    }
}
