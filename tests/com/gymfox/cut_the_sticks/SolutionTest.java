package com.gymfox.cut_the_sticks;

import org.junit.Test;

import static com.gymfox.cut_the_sticks.Solution.cutTheSticks;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void cutTheSticksTest() {
        assertArrayEquals(new int[]{8, 6, 4, 1}, cutTheSticks(new int[]{1, 2, 3, 4, 3, 3, 2, 1}));
        assertArrayEquals(new int[]{6, 4, 2, 1}, cutTheSticks(new int[]{5, 4, 4, 2, 2, 8}));
        assertArrayEquals(new int[]{8, 7, 6, 4, 3, 2}, cutTheSticks(new int[]{8, 8, 14, 10, 3, 5, 14, 12}));
    }
}