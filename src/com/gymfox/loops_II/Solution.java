package com.gymfox.loops_II;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queryCount = in.nextInt();

        for (int i = 0; i < queryCount; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int stepResult = a;

            for (int j = 0; j < n; j++) {
                stepResult += (int) Math.pow(2, j) * b;

                System.out.printf("%d ", stepResult);
            }
            System.out.println();
        }
        in.close();
    }
}
