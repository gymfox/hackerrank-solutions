package com.gymfox.simple_array_sum;

import org.junit.Assert;
import org.junit.Test;

import static com.gymfox.simple_array_sum.Solution.simpleArraySum;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void simpleArraySumTest() {
        assertEquals(31, simpleArraySum(new int[]{1, 2, 3, 4, 10, 11}));
        assertEquals(6, simpleArraySum(new int[]{1, 2, 3}));
    }
}