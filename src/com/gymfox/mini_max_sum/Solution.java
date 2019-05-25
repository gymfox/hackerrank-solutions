package com.gymfox.mini_max_sum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minSum = 0;
        long maxSum = 0;

        for (int i = 0, j = 1; i < arr.length - 1; i++, j++) {
            minSum += arr[i];
            maxSum += arr[j];
        }
        System.out.println(minSum + " " + maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
