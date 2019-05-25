package com.gymfox.jumping_on_the_clouds;

import org.junit.Test;

import static com.gymfox.jumping_on_the_clouds.Solution.jumpingOnClouds;
import static org.junit.Assert.*;

public class solutionTest {

    @Test
    public void jumpingOnCloudsTest() {
        assertEquals(3, jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 0}));
        assertEquals(4, jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
        assertEquals(3, jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0}));
    }
}