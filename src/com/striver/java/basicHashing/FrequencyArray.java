package com.striver.java.basicHashing;

import java.util.*;

public class FrequencyArray {

    public static int[] frequency(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] frequency = new int[map.size()];
        int i = 0;
        for (int freq : map.values()) {
            frequency[i++] = freq;
        }
        return frequency;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 10, 15, 10, 5 };
        System.out.println(Arrays.toString(frequency(arr)));
    }
}
