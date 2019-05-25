package com.gymfox.the_hurdle_race;

import org.junit.Test;

import static com.gymfox.the_hurdle_race.Solution.hurdleRace;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void hurdleRaceTest() {
        assertEquals(0, hurdleRace(7, new int[]{2, 5, 4, 5, 2}));
        assertEquals(2, hurdleRace(4, new int[]{1, 6, 3, 5, 2}));
    }
}