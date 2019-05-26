package com.gymfox.viral_advertising;

public class Solution {
    private static final int HALF = 2;

    static int viralAdvertising(int n) {
        int[] days = new int[n];
        int shared = 5;
        int cumulative = 0;

        for (int i = 0; i < days.length; i++) {
            days[i] = shared / HALF;
            shared = days[i] * 3;

            cumulative += days[i];
        }

        return cumulative;
    }
}
