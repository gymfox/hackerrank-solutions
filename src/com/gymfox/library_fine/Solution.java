package com.gymfox.library_fine;

public class Solution {
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if ( y1 > y2 ) {
            return (y1 - y2) * 10000;
        }

        if ( y1 == y2 ) {
            if ( m1 > m2 ) {
                return (m1 - m2) * 500;
            }

            if ( m1 == m2 ) {
                if ( d1 > d2 ) {
                    return (d1 - d2) * 15;
                }
            }
        }

        return 0;
    }
}
