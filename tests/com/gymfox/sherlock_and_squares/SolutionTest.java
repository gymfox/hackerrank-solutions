package com.gymfox.sherlock_and_squares;

import org.junit.Test;

import static com.gymfox.sherlock_and_squares.Solution.squares;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void squaresTest() {
        assertEquals(2, squares(3,9));
        assertEquals(3, squares(1,9));
        assertEquals(4, squares(0,9));
        assertEquals(0, squares(17,24));
    }
}