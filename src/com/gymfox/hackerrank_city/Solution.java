package com.gymfox.hackerrank_city;

/*
    https://www.hackerrank.com/challenges/hr-city/problem
*/

public class Solution {
    static int hackerrankCity(int[] array) {
        int nodeCount = 1;

        for (int i = 0; i < array.length; i++) {
            nodeCount += (int) Math.pow(2, i) * 5 * (i + 1);
        }

        return nodeCount;
    }

    public static void main(String[] args) {
        System.out.println(hackerrankCity(new int[]{1}));
        System.out.println(hackerrankCity(new int[]{2,1}));
        System.out.println(hackerrankCity(new int[]{3,2,1}));
        System.out.println(hackerrankCity(new int[]{4,3,2,1}));
    }
}
