package com.gymfox.cats_and_mouse;

public class Solution {
    static String catAndMouse(int x, int y, int z) {
        if ( Math.abs(z - x) < Math.abs(z - y) ) {
            return "Cat A";
        }
        if ( Math.abs(z - x) > Math.abs(z - y) ) {
            return "Cat B";
        }
        return "Mouse C";
    }
}
