package com.gymfox.string_reverse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        System.out.println(string.equals(new StringBuilder(string).reverse().toString()) ? "Yes" : "No");
    }
}
