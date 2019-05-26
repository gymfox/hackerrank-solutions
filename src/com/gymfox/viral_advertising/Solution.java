package com.gymfox.viral_advertising;

public class Solution {
    private static final int HALF = 2;

    static int viralAdvertising(int n) {
        int shared = 5;
        int cumulative = 0;

        for (int i = 0; i < n; i++) {
            shared = shared / HALF * 3;

            cumulative += shared;
        }

        return cumulative;
    }
}
