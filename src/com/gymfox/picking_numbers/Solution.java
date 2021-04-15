package com.gymfox.picking_numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> newSequence = new HashMap<>();
        int maxLength = 0;
        
        for (Integer integer : a) {
            if (newSequence.containsKey(integer)) {
                newSequence.put(integer, newSequence.get(integer) + 1);
            } else {
                newSequence.put(integer, 1);
            }
        }

        for (Integer integer : newSequence.keySet()) {
            int left = (newSequence.containsKey(integer-1)) ? newSequence.get(integer) + newSequence.get(integer-1) : newSequence.get(integer);
            int right = (newSequence.containsKey(integer+1)) ? newSequence.get(integer) + newSequence.get(integer+1) : newSequence.get(integer);

            if ( left > maxLength ) maxLength = left;
            if ( right > maxLength ) maxLength = right;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(pickingNumbers(new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(2);
            add(3);
            add(1);
            add(2);
        }}));
    }
}
