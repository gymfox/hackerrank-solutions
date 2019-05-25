package com.gymfox.day_of_the_programmer;

import java.io.File;

public class Solution {
    private static File output = new File(System.getenv("PWD")+"/output");
    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        if ( year == 1918 ) {
            return "26.09.1918";
        }
        return (year < 1918 && year % 4 == 0) || (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) ? String.format(
                "12.09.%d",
                 year) : String.format("13.09.%d", year);

    }
}
