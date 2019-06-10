package com.gymfox.equalize_the_array;

import org.junit.Test;

import static com.gymfox.equalize_the_array.Solution.equalizeArray;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void equalizeArrayTest() {
        assertEquals(2, equalizeArray(new int[]{3,3,2,1,3}));
        assertEquals(2, equalizeArray(new int[]{1,2,2,3}));
        assertEquals(5, equalizeArray(new int[]{96, 96, 45, 52, 73, 44, 51, 96}));
    }
}