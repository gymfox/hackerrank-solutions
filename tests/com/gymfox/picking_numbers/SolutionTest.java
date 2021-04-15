package com.gymfox.picking_numbers;

import org.junit.Test;

import java.util.ArrayList;

import static com.gymfox.picking_numbers.Solution.pickingNumbers;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void pickingNumberTest() {
        assertEquals(5, pickingNumbers(new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(2);
            add(3);
            add(1);
            add(2);
        }}));

        assertEquals(3, pickingNumbers(new ArrayList<Integer>(){{
            add(4);
            add(6);
            add(5);
            add(3);
            add(3);
            add(1);
        }}));
    }
}