package com.striver.java.basicMath;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int n){
        int temp=n;
        int reverse=0;
        while(temp>0){
            int rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;
        }
        return reverse;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverseNumber(n));
        sc.close();
    }
}
