package com.gymfox.append_and_delete;

import org.junit.Test;

import static com.gymfox.append_and_delete.Solution.appendAndDelete;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void appendAndDeleteTest() {
        assertEquals("Yes", appendAndDelete("hackerhappy", "hackerrank", 9));
        assertEquals("Yes", appendAndDelete("aba", "aba", 7));
        assertEquals("No", appendAndDelete("ashley", "ash", 2));
        assertEquals("No", appendAndDelete("abcd", "abcdert", 10));
        assertEquals("No", appendAndDelete("y", "yu", 2));
    }
}