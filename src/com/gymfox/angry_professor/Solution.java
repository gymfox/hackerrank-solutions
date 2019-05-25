package com.gymfox.angry_professor;

public class Solution {
    static String angryProfessor(int expectedStudents, int[] studentsGroup) {
        int lateStudents = 0;

        for (int student : studentsGroup) {
            if (student > 0) {
                lateStudents += 1;
            }
        }

        return studentsGroup.length - lateStudents >= expectedStudents ? "NO" : "YES";
    }
}
