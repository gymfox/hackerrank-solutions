package com.gymfox.acm_icpc_team;

public class Solution {
    static int[] acmTeam(String[] topic) {
        int totalTopicsCount = 0;
        int teamsCount = 0;
        int people = topic.length;

        for (int i = 0; i < people; i++) {

            for (int j = i + 1; j < people; j++) {
                int topicsCount = (int) countTopics(topic[i], topic[j]);

                if (totalTopicsCount < topicsCount) {
                    teamsCount = 1;
                    totalTopicsCount = topicsCount;
                } else if (totalTopicsCount == topicsCount) {
                    teamsCount += 1;
                }
            }
        }

        return new int[]{totalTopicsCount, teamsCount};
    }

    private static long countTopics(String s1, String s2) {
        StringBuilder merged = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            merged.append(s1.charAt(i) == '1' || s2.charAt(i) == '1' ? '1' : '0');
        }

        return merged.toString().chars().filter(x -> x == '1').count();
    }
}
