package com.gymfox.taum_and_bday;

public class Solution {
    static long taumBday(long b, long w, long bc, long wc, long z) {
        return b * Math.min(bc, (wc + z)) + w * Math.min(wc, (bc + z));
    }
}
