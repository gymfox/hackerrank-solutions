package com.gymfox.extra_long_factorial;

import java.math.BigInteger;

import static java.math.BigInteger.valueOf;

public class Solution {
    static BigInteger extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger("1");

        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(valueOf(i));
        }

        return factorial;
    }

    public static void main(String[] args) {
        extraLongFactorials(30);
    }
}
