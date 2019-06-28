package com.gymfox.save_prisoner;

import org.junit.Test;

import static com.gymfox.save_prisoner.Solution.saveThePrisoner;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void saveThePrisonerTest() {
        assertEquals(2, saveThePrisoner(5, 2, 1));
        assertEquals(3, saveThePrisoner(5, 2, 2));
        assertEquals(6, saveThePrisoner(7, 19, 2));
        assertEquals(3, saveThePrisoner(3, 7, 3));
    }
}