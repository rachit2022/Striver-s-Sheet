package com.striver.java.basicRecursion;

import java.util.Scanner;

public class PalindromeRecrusion {

    public static boolean palindromeCheck(String s) {
        return palindromeCheck(s, 0, s.length() - 1);
    }

    public static boolean palindromeCheck(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return palindromeCheck(s, start + 1, end - 1);
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(palindromeCheck(s));
        sc.close();
    }
}
