package com.gymfox.jumping_on_the_clouds_revisited;

public class Solution {
    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;

        for (int i = 0; i < c.length; i += k, energy--) {
            if (c[i] == 1) {
                energy -= 2;
            }
        }

        return energy;
    }
}
