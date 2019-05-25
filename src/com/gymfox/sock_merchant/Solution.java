package com.gymfox.sock_merchant;

import java.util.Arrays;

public class Solution {
    static int sockMerchant(int n, int[] ar) {
        int pair = 0;
        Arrays.sort(ar);

        for (int i = 0; i < ar.length - 1; i++) {
            if ( i < n && ar[i] == ar[i + 1] ) {
                pair += 1;
                i += 1;
            }
        }

        return pair;
    }
}
