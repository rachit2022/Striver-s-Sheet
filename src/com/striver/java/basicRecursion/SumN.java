package com.striver.java.basicRecursion;
import java.util.Scanner;
public class SumN {
    public static int NnumbersSum(int N) {
        //your code goes here
        if(N==0){
            return 0;
        }
        return N+NnumbersSum(N-1);
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(NnumbersSum(n));
        sc.close();
    }

}
