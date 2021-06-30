package com.gymfox.strings_intro;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.next();
        String B = scanner.next();

        System.out.println(sumTwoStrings(A, B));
        System.out.println(isAlphabetically(A, B));
        System.out.println(capitalizeLetter(A) + " " + capitalizeLetter(B));
    }

    private static int sumTwoStrings(String a, String b) {
        return a.length() + b.length();
    }

    private static String isAlphabetically(String a, String b) {
        return a.compareTo(b) > 0 ? "Yes" : "No";
    }

    private static String capitalizeLetter(String a) {
        return a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
    }
}
