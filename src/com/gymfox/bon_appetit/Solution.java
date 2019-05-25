package com.gymfox.bon_appetit;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int actualSum = 0;

        for (int i = 0; i < bill.size(); i++) {
            actualSum += bill.get(i);
        }

        int actualCharged = (actualSum - bill.get(k)) / 2;

        if ( actualCharged != b ) {
            System.out.println(b - actualCharged);

            return;
        }

        System.out.println("Bon Appetit");
    }

    public static void main(String[] args) {
        List<Integer>bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        bonAppetit(bill, 1, 12);
        bonAppetit(bill, 1, 7);
    }
}
