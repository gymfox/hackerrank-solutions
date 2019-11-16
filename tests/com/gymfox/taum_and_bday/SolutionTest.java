package com.gymfox.taum_and_bday;

import org.junit.Test;

import static com.gymfox.taum_and_bday.Solution.taumBday;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void taumBdayTest() {
        assertEquals(36, taumBday(4, 6, 3, 4, 2));
        assertEquals(141, taumBday(5, 7, 10, 13, 5));
        assertEquals(18192035842L, taumBday(27984, 1402,619246, 615589, 247954));
        assertEquals(39331944938L, taumBday(68406, 12718, 532909, 315341, 201009));
    }
}