package com.gymfox.diagonal_difference;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    private static File output = new File(System.getenv("PWD")+"/output");

    // Complete the aVeryBigSum function below.
    static int diagonalDifference(int[][] arr) {
        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for (int i = 0; i < arr.length; i++) {
            leftDiagonal += arr[i][i];
            rightDiagonal += arr[arr.length-1-i][i];
        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
