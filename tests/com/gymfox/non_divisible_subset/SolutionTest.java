package com.gymfox.non_divisible_subset;

import org.junit.Test;

import static com.gymfox.non_divisible_subset.Solution.nonDivisibleSubset;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void nonDivisibleSubsetTest() {
        assertEquals(4, nonDivisibleSubset(3, new int[]{1, 3, 7, 4, 2}));
//        assertEquals(4, nonDivisibleSubset(9, new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(3, nonDivisibleSubset(4, new int[]{19, 10, 12, 10, 24, 25, 22}));
        assertEquals(11, nonDivisibleSubset(7, new int[]{278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436}));
    }

}