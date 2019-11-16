package com.gymfox.repeated_string;

public class Solution {
    static long repeatedString(String s, long n) {
        long countForSubstring = 0;
        long totalCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) == 'a' ) {
                countForSubstring += 1;
            }
        }

        totalCount += n / s.length() * countForSubstring;

        long reminder = n % s.length();

        for (int i = 0; i < reminder; i++) {
            if (s.charAt(i) == 'a') {
                totalCount += 1;
            }
        }

        return totalCount;
    }
}
