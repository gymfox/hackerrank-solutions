package com.gymfox.beautiful_days_at_the_movies;

import org.junit.Test;

import static com.gymfox.beautiful_days_at_the_movies.Solution.beautifulDays;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void beautifulDaysTest() {
        assertEquals(2, beautifulDays(20, 23, 6));
    }
}