package com.gymfox.extra_long_factorial;

import org.junit.Test;

import java.math.BigInteger;

import static com.gymfox.extra_long_factorial.Solution.extraLongFactorials;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void extraLongFactorialsTest() {
        assertEquals(new BigInteger("15511210043330985984000000"), extraLongFactorials(25));
    }
}