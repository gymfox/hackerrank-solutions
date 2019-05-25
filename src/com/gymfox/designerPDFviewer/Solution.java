package com.gymfox.designerPDFviewer;

public class Solution {
    static int designerPdfViewer(int[] h, String word) {
        int maxHeight = 0;

        for (int i = 0; i < word.length(); i++) {
            if ( maxHeight < h[word.charAt(i) - 97] ) {
                maxHeight = h[word.charAt(i) - 97];
            }
        }
        return maxHeight * word.length();
    }

    public static void main(String[] args) {
        designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},"abc");
        designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7}, "zaba");
    }
}
