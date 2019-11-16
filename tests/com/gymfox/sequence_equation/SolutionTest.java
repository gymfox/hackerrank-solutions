package com.gymfox.sequence_equation;

import org.junit.Test;

import static com.gymfox.sequence_equation.Solution.permutationEquation;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void permutationEquationTest() {
        assertArrayEquals(new int[]{1, 3, 5, 4, 2}, permutationEquation(new int[]{4, 3, 5, 1, 2}));
        assertArrayEquals(new int[]{2, 3, 1}, permutationEquation(new int[]{2, 3, 1}));
    }
}