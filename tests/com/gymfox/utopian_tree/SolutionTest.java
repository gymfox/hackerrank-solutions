package com.gymfox.utopian_tree;

import org.junit.Test;

import static com.gymfox.utopian_tree.Solution.utopianTree;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void utopianTreeTest() {
        assertEquals(1, utopianTree(0));
        assertEquals(2, utopianTree(1));
        assertEquals(7, utopianTree(4));
        assertEquals(14, utopianTree(5));
    }
}