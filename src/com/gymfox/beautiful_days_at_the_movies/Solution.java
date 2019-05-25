package com.gymfox.beautiful_days_at_the_movies;

public class Solution {
    static int beautifulDays(int i, int j, int k) {
        int count = 0;

        for ( ; i <= j; i++ ) {
            double day = (((i - reversInt(i)) * 1.0) / k);

            if ( day % 1 == 0 ) {
                count += 1;
            }
        }

        return count;
    }

    private static int reversInt(int number) {
        int reverseInteger = 0;

        for (; number != 0; number /= 10) {
            reverseInteger = reverseInteger * 10 + number % 10;
        }

        return reverseInteger;
    }
}
