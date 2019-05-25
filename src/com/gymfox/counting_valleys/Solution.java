package com.gymfox.counting_valleys;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the countingValleys function below.

    /**
     * Достаточно посчитать, сколько раз Гери возвращался на уровень моря
     * @param n - уровень моря
     * @param s -
     * @return
     */
    static int countingValleys(int n, String s) {
        int level = n;
        int result = 0;

        for ( char c : s.toCharArray() ) {
            if ( c == 'U' ) level += 1;
            if ( c == 'D' ) level -= 1;
            if ( level == n && c == 'U' ) {
                result += 1;
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
