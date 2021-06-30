package com.gymfox.service_lane;

import com.gymfoxTest.tester.Tester;

public class Solution {
    static int[] serviceLane(int n, int[][] cases) {
        int[] result = new int[n];

        for (int i = 0; i < cases.length; i++) {
            System.out.printf("%d, ", cases[i][0]);
            for (int j = 1; j < cases[i].length; j++) {
                System.out.printf("%d\n", cases[i][j]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Tester.tester(new int[]{1, 2, 3, 2, 1}, serviceLane(5, new int[][]{{0,3}, {4,6}, {6,7}, {3,5}, {0,7}}));
    }
}
