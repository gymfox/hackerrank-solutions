package com.gymfox.acm_icpc_team;

import org.junit.Test;

import static com.gymfox.acm_icpc_team.Solution.acmTeam;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Test
    public void acmTeamTest() {
        assertArrayEquals(new int[]{5, 2}, acmTeam(new String[]{"10101", "11100", "11010", "00101"}));
//        assertArrayEquals(new int[]{5, 1}, acmTeam(new String[]{"10101", "11110", "00010"}));
    }
}