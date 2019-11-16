package com.gymfox.modifiedKaprekarNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static void kaprekarNumbers(int p, int q) {
        List<Integer> kaprekarNumbers = new ArrayList<>();

        for (; p < q; p++) {
            if (findKaprekarNumber(p) == p) {
                kaprekarNumbers.add(p);
            }
        }

        for (int i = 0; i < kaprekarNumbers.size(); i++) {

            System.out.print(kaprekarNumbers.get(i) + " ");
        }
    }

    private static int findKaprekarNumber(int p) {
        String square = String.valueOf(p * p);
        int answer = 1;

        String rightPart = "0";
        String leftPart = "0";

        for (int i = 0; i < square.length() / 2; i++) {
            rightPart += square.charAt(i);

        }

        for (int i = square.length() / 2; i < square.length(); i++) {
            leftPart += square.charAt(i);
        }

        answer = Integer.parseInt(rightPart) + Integer.parseInt(leftPart);

        return answer;
    }

    public static void main(String[] args) {
        kaprekarNumbers(1, 100);
        kaprekarNumbers(100, 300);
    }
}
