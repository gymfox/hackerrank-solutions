package com.gymfox.breaking_the_records;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    private static File output = new File(System.getenv("PWD")+"/output");
    private static final Scanner scanner = new Scanner(System.in);

    static int[] breakingRecords(int[] scores) {
        int[] scoreTable = new int[]{0,0};
        int highestScore = scores[0];
        int lowestScore = highestScore;

        for (int i = 1; i < scores.length; i++) {
            if ( highestScore < scores[i] ) {
                highestScore = scores[i];
                scoreTable[0] += 1;
            }

            if ( lowestScore > scores[i] ) {
                lowestScore = scores[i];
                scoreTable[1] += 1;
            }
        }

        return scoreTable;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
