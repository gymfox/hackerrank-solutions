package com.gymfox.jumping_on_the_clouds;

public class Solution {
    static int jumpingOnClouds(int[] c) {
        int count = 0;

        for (int i = 0;  i < c.length - 1; i++ ) {
            if (i + 2 < c.length && (c[i + 2] == 0)) {
                i += 1;
                count += 1;
            } else {
                count += 1;
            }
        }

        return count;
    }
}
