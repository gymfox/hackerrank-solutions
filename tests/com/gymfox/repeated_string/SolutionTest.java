package com.gymfox.repeated_string;

import org.junit.Test;

import static com.gymfox.repeated_string.Solution.repeatedString;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void repeatedStringTest() {
        assertEquals(7, repeatedString("aba", 10));
        assertEquals(1000000000, repeatedString("a", 1000000000));
//        assertEquals(51574523448, repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm", 736778906400));
    }
}