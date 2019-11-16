package com.gymfox.find_digits;

public class Solution {
    static int findDigits(int n) {
        int count = 0;

        for (int i = 1; i < n; i *= 10) {
            int divisor = (n / i) % 10;

            if ( divisor != 0 && n % divisor == 0 ) {
                count += 1;
            }
        }

        return count;
    }
}
