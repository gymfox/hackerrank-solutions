package com.gymfox.minimum_distance;

import org.junit.Test;

import static com.gymfox.minimum_distance.Solution.minimumDistance;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void minimumDistanceTest() {
        assertEquals(2, minimumDistance(new int[]{3, 2, 1, 2, 3}));
        assertEquals(3, minimumDistance(new int[]{4, 3, 1, 2, 3}));
        assertEquals(3, minimumDistance(new int[]{7, 1, 3, 4, 1, 7}));
        assertEquals(1, minimumDistance(new int[]{1,1}));
    }
}