package com.gymfox.migratory_birds;

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

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int[] counter = new int[arr.size()];
        int max = 0;
        int result = 1;

        for (int i = 0; i < arr.size(); i++) {
            counter[arr.get(i)]++;
        }

        for (int i = 1; i < arr.size(); i++) {
            if ( counter[i] > max ) {
                result = i;
                max = counter[i];
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
