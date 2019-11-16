package com.gymfox.encryption;

public class Solution {
    static String encryption(String s) {
        StringBuilder encryptText = new StringBuilder();
        int rowCount = (int) Math.sqrt(s.length()); //3
        int colCount = s.length() > rowCount * rowCount ? rowCount + 1 : rowCount; // 4

        rowCount = expandTheRow(s.length(), rowCount, colCount);

        for (int i = 0; i < colCount; i++) {
            int currentIndex = i;

            for (int j = 0; j < rowCount; j++) {
                if ( currentIndex <= s.length() - 1 ) {
                    encryptText.append(s.charAt(currentIndex));
                }

                currentIndex += colCount;
            }

            encryptText.append(i + 1 != colCount ? " " : "");
        }

        return encryptText.toString();
    }

    private static int expandTheRow(int length, int rowCount, int colCount) {
        return length > rowCount * colCount ? rowCount + 1 : rowCount;
    }
}
