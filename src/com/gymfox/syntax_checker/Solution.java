package com.gymfox.syntax_checker;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

import static java.util.regex.Pattern.compile;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stringsCount = scanner.nextInt();

        while (stringsCount != 0) {
            String pattern = scanner.nextLine();

            try {
                compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException patternSyntaxException) {
                System.out.println("Invalid");
            }

            stringsCount -= 1;
        }
    }
}
