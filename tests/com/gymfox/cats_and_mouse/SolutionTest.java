package com.gymfox.cats_and_mouse;

import org.junit.Test;

import static com.gymfox.cats_and_mouse.Solution.catAndMouse;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void catAndMouseTest() {
        assertEquals("Cat B", catAndMouse(1, 2, 3));
        assertEquals("Mouse C", catAndMouse(1, 3, 2));
    }
}