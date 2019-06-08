package com.gymfox.non_divisible_subset;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int nonDivisibleSubset(int k, int[] S) {
        int count = 1;

        Map<Integer, Integer> remainders = new HashMap<>();

        for (int item : S) {
            remainders.compute(item % k, (key, value) -> (value == null || key == 0) ? 1 : value + 1);
        }

        int noOfElementsInSubset = remainders.getOrDefault(0, 0);

        for (int i = count; 2 * i < k; i++) {
            noOfElementsInSubset += Math.max(remainders.getOrDefault(i, 0), remainders.getOrDefault(k - i, 0));
            count += 1;
        }

        return 2 * count == k ? noOfElementsInSubset + 1 : noOfElementsInSubset;
    }

    public static void main(String[] args) {
        System.out.println(nonDivisibleSubset(9, new int[]{1, 2, 3, 4, 5, 6}));
    }
}
