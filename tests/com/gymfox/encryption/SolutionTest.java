package com.gymfox.encryption;

import org.junit.Test;

import static com.gymfox.encryption.Solution.encryption;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void encryptionTest() {
        assertEquals("hae and via ecy", encryption("haveaniceday"));
        assertEquals("clu hlt io", encryption("chillout"));
    }
}