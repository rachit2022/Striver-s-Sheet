package com.striver.java.basicHashing;

import java.util.Arrays;

public class TransformArray {
    public static int[] transformArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args){
        int[] arr={4,3,2,1};
        System.out.println(Arrays.toString(transformArray(arr)));

    }
}
