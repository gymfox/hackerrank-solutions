package com.gymfox.save_prisoner;

public class Solution {
    static int saveThePrisoner(int n, int m, int s) {
        return (s + m - 1) % n == 0 ? n : (s + m - 1) % n;
    }
}
