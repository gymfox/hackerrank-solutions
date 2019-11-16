package com.gymfox.library_fine;

import org.junit.Test;

import static com.gymfox.library_fine.Solution.libraryFine;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void libraryFineTest() {
        assertEquals(45, libraryFine(9, 6, 2015, 6, 6, 2015));
        assertEquals(0, libraryFine(6, 6, 2015, 9, 6, 2015));
        assertEquals(0, libraryFine(15, 7, 2015, 1, 7, 2016));
    }
}