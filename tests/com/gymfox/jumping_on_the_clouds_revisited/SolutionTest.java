package com.gymfox.jumping_on_the_clouds_revisited;

import org.junit.Test;

import static com.gymfox.jumping_on_the_clouds_revisited.Solution.jumpingOnClouds;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void jumpingOnCloudsTest() {
        assertEquals(92, jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
        assertEquals(94, jumpingOnClouds(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));
    }
}