package com.gymfox.arrays_ds;

import org.junit.Test;

import static com.gymfox.arrays_ds.Solution.reverseArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void reverseArrayTest() {
        assertEquals(new int[]{2, 3, 4, 1}, reverseArray(new int[] {1, 4, 3, 2}));
    }
}