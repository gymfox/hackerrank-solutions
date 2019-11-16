package com.gymfox.simple_array_sum;

public class Solution {
    static int simpleArraySum(int[] ar) {
        int sum = 0;

        for (int value : ar) {
            sum += value;
        }

        return sum;
    }
}
