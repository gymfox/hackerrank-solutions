package com.gymfox.drawing_book;

import org.junit.Test;

import static com.gymfox.drawing_book.Solution.pageCount;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void pageCountTest() {
        assertEquals(1, pageCount(6,2));
        assertEquals(0, pageCount(5,4));
        assertEquals(1, pageCount(6,5));
//        assertEquals(0, pageCount(2,1));
    }
}