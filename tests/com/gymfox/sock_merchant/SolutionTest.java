package com.gymfox.sock_merchant;

import org.junit.Test;

import static com.gymfox.sock_merchant.Solution.sockMerchant;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sockMerchantTest() {
        assertEquals(3, sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
        assertEquals(2, sockMerchant(7, new int[]{1, 2, 1, 2, 1, 3, 2}));
        assertEquals(9, sockMerchant(20, new int[]{4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5}));
    }
}