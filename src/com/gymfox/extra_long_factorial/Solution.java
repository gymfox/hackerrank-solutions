package com.gymfox.extra_long_factorial;

import java.math.BigInteger;

public class Solution {
    static BigInteger extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger("1");

        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
