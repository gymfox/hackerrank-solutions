package com.gymfox.electronics_shop;

public class Solution {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;

        for (int i = keyboards.length - 1; i >= 0 ; i--) {
            for (int j = drives.length - 1; j >= 0 ; j--) {
                if ( keyboards[i] + drives[j] <= b && max < keyboards[i] + drives[j] ) {
                    max = keyboards[i] + drives[j];
                }
            }
        }

        return max;
    }
}
