package com.gymfox.equalize_the_array;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int equalizeArray(int[] arr) {
        return arr.length - getMaximalRepeatedElementsCount(countRepeatedElements(arr));
    }

    private static HashMap<Integer, Integer>countRepeatedElements(int[] array) {
        HashMap<Integer, Integer> newHashMap = new HashMap<>();

        for (int item : array) {
            newHashMap.compute(item, (key, value) -> (value == null || key == 0) ? 1 : value + 1);
        }

        return newHashMap;
    }

    private static int getMaximalRepeatedElementsCount(Map<Integer, Integer> elements) {
        int repeatElementsCount = elements.getOrDefault(0, 0);

        for (Map.Entry<Integer, Integer> maxElements : elements.entrySet()) {
            repeatElementsCount = maxElements.getValue() > repeatElementsCount ?
                    maxElements.getValue() :
                    repeatElementsCount;
        }

        return repeatElementsCount;
    }
}
