package com.gymfox.beatifulTriplet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    static int beautifulTriplets(int d, int[] arr) {
        int count = 0;

        List<Integer> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (Integer number : numbers) {
            if (numbers.contains(number + d) && numbers.contains(number + (d * 2))) {
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(beautifulTriplets(3, new int[]{1, 2, 4, 5, 7, 8, 10}));
    }
}
