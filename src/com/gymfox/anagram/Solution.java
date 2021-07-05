package com.gymfox.anagram;

import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] aArr = a.toLowerCase().toCharArray();
        java.util.Arrays.sort(aArr);
        char[] bArr = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(bArr);

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (aArr[i] == bArr[i]) count += 1;
        }

        return count == a.length();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
