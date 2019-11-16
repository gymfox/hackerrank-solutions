package com.gymfox.viral_advertising;

import org.junit.Test;

import static com.gymfox.viral_advertising.Solution.viralAdvertising;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void viralAdvertisingTest() {
        assertEquals(2, viralAdvertising(1));
        assertEquals(5, viralAdvertising(2));
        assertEquals(9, viralAdvertising(3));
        assertEquals(15, viralAdvertising(4));
        assertEquals(24, viralAdvertising(5));
    }

}