package com.gymfox.halloween_sale;

import org.junit.Test;

import static com.gymfox.halloween_sale.Solution.howManyGames;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void howManyGamesTest() {
        assertEquals(6, howManyGames(20, 3, 6, 80));
        assertEquals(7, howManyGames(20, 3, 6, 85));
        assertEquals(10, howManyGames(1, 55, 1, 10));
        assertEquals(9917, howManyGames(16, 2, 1, 9981));
        assertEquals(1, howManyGames(100,19, 1, 180));
        assertEquals(1, howManyGames(100,99, 81, 180));
    }
}