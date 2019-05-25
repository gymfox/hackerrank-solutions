package com.gymfox.angry_professor;

import org.junit.Test;

import static com.gymfox.angry_professor.Solution.angryProfessor;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void angryProfessorTest() {
        assertEquals("NO", angryProfessor(1, new int[]{-1, -2, -1, 0}));
        assertEquals("NO", angryProfessor(2, new int[]{0, -1, 2, 1}));
        assertEquals("YES", angryProfessor(3, new int[]{-1, -3, 4, 2}));
        assertEquals("YES", angryProfessor(3, new int[]{-1, 3, 4, 2}));
        assertEquals("YES", angryProfessor(4, new int[]{1, 2, 3, 4}));
        assertEquals("NO", angryProfessor(4, new int[]{0, 0, 0, 0}));
    }
}