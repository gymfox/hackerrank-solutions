package com.gymfox.append_and_delete;

public class Solution {
    static String appendAndDelete(String s, String t, int k) {
        int totalSize = s.length() + t.length();
        String smallString = selectSmallString(s, t);
        int count = 0;

        for (int i = 0; i < smallString.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }

            count +=1;
        }

        return totalSize <= k + count * 2 && totalSize % 2 == k % 2 || totalSize < k ? "Yes" : "No";
    }

    public static String selectLongString(String s1, String s2) {
        return s1.length() >= s2.length() ? s1 : s2;
    }

    public static String selectSmallString(String s1, String s2) {
        return s1.length() <= s2.length() ? s1 : s2;
    }
}
