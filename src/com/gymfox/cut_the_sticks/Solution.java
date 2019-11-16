package com.gymfox.cut_the_sticks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    static int[] cutTheSticks(int[] arr) {
        List<Integer>array = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        List<Integer>sticksCount = new ArrayList<>();

        while (!array.isEmpty()) {
            sticksCount.add(array.size());

            for (int i = 0; i < array.size(); i++) {
                array.set(i, array.get(i) - array.get(array.size()-1));
            }
            while (!array.isEmpty() && array.get(array.size() - 1) == 0) {
                array.remove(array.size() - 1);
            }
        }
        int[] arraySticksCount = new int[sticksCount.size()];

        for (int i = 0; i < sticksCount.size(); i++) {
            arraySticksCount[i] = sticksCount.get(i);
        }

        return arraySticksCount;
    }
}
