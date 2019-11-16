package com.gymfox.non_divisible_subset;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int nonDivisibleSubset(int k, int[] S) {
        Map<Integer, Integer> remainders = new HashMap<>();

        for (int item : S) {
            remainders.compute(item % k, (key, value) -> (value == null || key == 0) ? 1 : value + 1);
        }

        int noOfElementsInSubset = remainders.getOrDefault(0, 0);
        int count = 1;

        for (; 2 * count < k; ) {
            noOfElementsInSubset += Math.max(remainders.getOrDefault(count, 0), remainders.getOrDefault(k - count, 0));
            count += 1;
        }

        return 2 * count == k ? noOfElementsInSubset + 1 : noOfElementsInSubset;
    }
}
