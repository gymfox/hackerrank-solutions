package com.gymfox.string_tokens;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] array = s.split("[!,?._'@ ]");

        array = Arrays.stream(array).filter(str -> !str.isEmpty()).toArray(String[]::new);
        System.out.println(array.length);
        for (String s1 : array) {
            System.out.println(s1);
        }

        scan.close();
    }
}

// He is a very very good boy, isn't he?
//            YES      leading spaces        are valid,    problemsetters are         evillllll