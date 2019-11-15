package com.gymfox.minimum_distance;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    static int minimumDistance(int[] a) {
        int minDistance = -1;

        Map<Integer, Integer>distances = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if ( distances.containsKey(a[i]) ) {
                int distance = Math.abs(distances.get(a[i]) - i);

                if ( distance < minDistance || minDistance == -1 ) {
                    minDistance = distance;
                }
            } else {
                distances.put(a[i], i);
            }
        }

        return minDistance;
    }
}
