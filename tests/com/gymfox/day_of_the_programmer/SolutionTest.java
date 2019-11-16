package com.gymfox.day_of_the_programmer;

import org.junit.Test;

import static com.gymfox.day_of_the_programmer.Solution.dayOfProgrammer;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void dayOfProgrammerTest() {
        assertEquals("13.09.2017", dayOfProgrammer(2017));
        assertEquals("12.09.2016", dayOfProgrammer(2016));
        assertEquals("12.09.1800", dayOfProgrammer(1800));
        assertEquals("12.09.1900", dayOfProgrammer(1900));
        assertEquals("13.09.1913", dayOfProgrammer(1913));
        assertEquals("26.09.1913", dayOfProgrammer(1918));
    }
}