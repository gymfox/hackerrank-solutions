package com.gymfox.beatifulTriplet;

import org.junit.Test;

import static com.gymfox.beatifulTriplet.Solution.beautifulTriplets;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void beautifulTripletsTest() {
        assertEquals(3, beautifulTriplets(3, new int[]{1,2,4,5,7,8,10}));
        assertEquals(3, beautifulTriplets(1, new int[]{2,2,3,4,5}));
    }
}