package com.striver.java.basicMath;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        return sum==x;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
    }
}
