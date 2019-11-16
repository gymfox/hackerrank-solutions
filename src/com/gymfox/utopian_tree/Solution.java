package com.gymfox.utopian_tree;

public class Solution {
    static int utopianTree(int n) {
        int height = 1;

        for (int i = 0; i < n; i++) {
            height = incrementHeight(i, height);
        }

        return height;
    }

    private static int incrementHeight(int i, int height) {
        return i % 2 == 0 ? height * 2 : height + 1;
    }
}
