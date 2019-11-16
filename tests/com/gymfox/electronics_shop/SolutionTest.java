package com.gymfox.electronics_shop;

import org.junit.Test;

import static com.gymfox.electronics_shop.Solution.getMoneySpent;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getMoneySpentTest() {
        assertEquals(58, getMoneySpent(new int[]{40, 50, 60}, new int[]{5, 8, 12}, 60));
        assertEquals(9, getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
        assertEquals(-1, getMoneySpent(new int[]{4}, new int[]{5}, 5));
    }
}