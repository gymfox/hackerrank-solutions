package com.gymfox.organizing_container_of_balls;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    static String organizingContainers(int[][] container) {
        List<Integer> containers = new LinkedList<>();
        List<Integer> balls = new LinkedList<>();

        for (int i = 0; i < container.length; i++) {
            int rowSum = 0;
            int columnSum = 0;

            for (int j = 0; j < container.length; j++) {
                rowSum += container[i][j];
                columnSum += container[j][i];
            }

            containers.add(rowSum);
            balls.add(columnSum);
        }

        containers.removeAll(balls);

        return containers.isEmpty() ? "Possible" : "Impossible";
    }
}
