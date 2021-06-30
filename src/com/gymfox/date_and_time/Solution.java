package com.gymfox.date_and_time;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

class Result {

    public static String findDay(int month, int day, int year) {
        validateDate(month, day, year);
        Date date = null;
        try {
             date = new SimpleDateFormat("MM-dd-yyyy").parse(String.format("%d-%d-%d",month,day,year));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date).toUpperCase(Locale.ROOT);
    }

    private static void validateDate(int month, int day, int year) {
        int[] dayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int monthIndex = month - 1;

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            dayInMonth[1] += 1;
        }
        try {
            if (month < 1 || month > 12) {
                throw new Exception(String.format("Month cannot be greater than %d", month));
            }
            if (day > dayInMonth[monthIndex]) {
                throw new Exception(String.format("Day cannot be greater than %d", day));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.println(findDay(month, day, year));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
