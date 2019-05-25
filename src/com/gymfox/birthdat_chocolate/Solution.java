package com.gymfox.birthdat_chocolate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    private static File output = new File(System.getenv("PWD")+"/output");

    static int birthday(List<Integer> s, int d, int m) {
        validateSize(s.size());
        validateDays(d);
        validateMonth(m);

        int count = 0;

        for (int i = 0; i < s.size(); i++) {
            int sum = 0;

            for ( int j = i, k = 0; j < s.size() && k < m; j++, k++ ) {
                sum += s.get(j);

            }
            if ( sum == d ) {
                count += 1;
            }
        }

        return count;
    }

    private static void validateSize(int size) {
        if ( size > 100 ) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateDays(int d) {
        if ( d > 31 ) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateMonth(int m) {
        if ( m > 12 ) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
