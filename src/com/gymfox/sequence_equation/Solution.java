package com.gymfox.sequence_equation;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int[] permutationEquation(int[] p) {
        Map<Integer, Integer>inverseP = new HashMap<>();
        int[] newP = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            inverseP.put(p[i], i + 1);
        }

        for (int i = 0; i < inverseP.size(); i++) {
            newP[i] = inverseP.get(inverseP.get(i + 1));
        }

        return newP;
    }
}
