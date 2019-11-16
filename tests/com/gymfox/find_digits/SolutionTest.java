package com.gymfox.find_digits;

import org.junit.Test;

import static com.gymfox.find_digits.Solution.findDigits;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void findDigitsTest() {
        assertEquals(2, findDigits(12));
        assertEquals(3, findDigits(1012));
        assertEquals(2, findDigits(24));

        assertEquals(3, findDigits(123456789));
        assertEquals(2, findDigits(121));
        assertEquals(2, findDigits(33));
        assertEquals(2, findDigits(44));
        assertEquals(2, findDigits(55));
        assertEquals(2, findDigits(66));
        assertEquals(2, findDigits(77));
        assertEquals(2, findDigits(88));
        assertEquals(5, findDigits(106108048));
        assertEquals(3, findDigits(114108089));
        assertEquals(6, findDigits(110110015));
    }
}