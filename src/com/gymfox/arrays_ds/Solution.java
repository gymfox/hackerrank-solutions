package com.gymfox.arrays_ds;

public class Solution {
    static int[] reverseArray(int[] a) {
        int[] reverse = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            reverse[i] = a[a.length - 1 - i];
        }

        return reverse;
    }
}
