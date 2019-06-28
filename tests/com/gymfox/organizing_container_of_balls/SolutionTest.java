package com.gymfox.organizing_container_of_balls;

import org.junit.Test;

import static com.gymfox.organizing_container_of_balls.Solution.organizingContainers;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void organizingContainersTest() {
        assertEquals("Impossible", organizingContainers(new int[][]{{1, 4}, {2, 3}}));
        assertEquals("Possible", organizingContainers(new int[][]{{1, 1}, {1, 1}}));
        assertEquals("Possible", organizingContainers(new int[][]{{0, 2, 1}, {1, 1, 1}, {2, 0, 0}}));
        assertEquals("Impossible", organizingContainers(new int[][]{{0, 2, 1}, {1, 1, 1}, {0, 2, 0}}));
    }
}