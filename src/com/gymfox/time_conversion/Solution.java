package com.gymfox.time_conversion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private static File output = new File(System.getenv("PWD")+"/output");
    private static final Scanner scan = new Scanner(System.in);

    static String timeConversion(String s) {
        String[] inputTime = s.split(":");
        int hour = Integer.parseInt(inputTime[0]);
        String minutes = inputTime[1];
        String seconds = inputTime[2].substring(0,2);

        if (s.substring(8).equals("PM")) {
            if (hour < 12) {
                hour += 12;
            }
        }

        if (s.substring(8).equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        }

        return String.format("%02d:%s:%s", hour, minutes, seconds);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(output));
        List<String>times = new ArrayList<>();

        times.add("12:40:22AM");
        times.add("12:05:39AM");
        times.add("12:45:54PM");
        times.add("12:00:00AM");
        times.add("07:05:45PM");

        bw.write(timeConversion(times.get(0)));
        bw.newLine();
        bw.write(timeConversion(times.get(1)));
        bw.newLine();
        bw.write(timeConversion(times.get(2)));
        bw.newLine();
        bw.write(timeConversion(times.get(3)));
        bw.newLine();
        bw.write(timeConversion(times.get(4)));
        bw.newLine();

        bw.close();
    }
}
