package com.striver.java.basicRecursion;

import java.util.Scanner;

public class Fibonnaci {
    public static int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }
}
