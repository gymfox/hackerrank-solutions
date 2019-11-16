package com.gymfox.drawing_book;

public class Solution {
    static int pageCount(int n, int p) {
//        int start = p / 2;
//        int end;
//
//        if ( n % 2 == 1 ) {
//            end = (n - p) / 2;
//        } else {
//            end = (int) Math.ceil((n - p) / 2.0);
//        }
//
//        return Math.min(end, start);
        return Math.min(n % 2 == 1 ? (n - p) / 2 : (int) Math.ceil((n - p) / 2.0), p / 2);
    }
}
