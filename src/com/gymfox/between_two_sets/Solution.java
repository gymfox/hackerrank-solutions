package com.gymfox.between_two_sets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    private static File output = new File(System.getenv("PWD")+"/output");

    static int getTotalX(int[] a, int[] b) {
        int m = 0;
        int n = 0;
        int count = 0;

        m = leastCommonMultiple(a, a.length);
        n = findGreatestCommonDivisor(b, b.length);

        for (int i = m, j = 2; i <= n; i = m*j, j++) {
            if ( n%i == 0 ) {
                count += 1;
            }
        }

        return count;
    }

    private static int findGreatestCommonDivisor(int[] b, int length) {
        int result = b[0];

        for (int i = 1; i < length; i++) {
            result = greatestCommonDivisor(b[i], result);
        }

        return result;
    }

    private static int greatestCommonDivisor(int a, int b) {
        return b == 0 ? a : greatestCommonDivisor(b, a%b);
    }

     private static int leastCommonMultiple(int[] a, int length) {
        int result = 1;

        for ( int i = 0; i < length; i++ ) {
            result *= a[i]/greatestCommonDivisor(result, a[i]);
        }

        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(output));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}
