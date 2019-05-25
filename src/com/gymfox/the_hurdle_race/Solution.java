package com.gymfox.the_hurdle_race;

import java.util.Arrays;

public class Solution {
    static int hurdleRace(int k, int[] height) {
        int diff = Arrays.stream(height).max().getAsInt() - k;

        return diff > 0 ? diff : 0;
    }
}
