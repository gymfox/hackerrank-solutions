package com.gymfox.chocolate_feast;

import static com.gymfoxTest.tester.Tester.tester;

public class Solution {
    static int chocolateFeast(int moneyToSpent, int cost, int wrappersToChange) {
        int chocolateCount = moneyToSpent / cost;
        int countAte = chocolateCount;

        while ( chocolateCount >= wrappersToChange ) {
            countAte += chocolateCount / wrappersToChange;
            chocolateCount = ( chocolateCount / wrappersToChange ) + ( chocolateCount % wrappersToChange );
        }

        return countAte;
    }

    public static void main(String[] args) {
        tester(9, chocolateFeast(15, 3, 2));
        tester(6, chocolateFeast(10, 2, 5));
        tester(3, chocolateFeast(12, 4, 4));
        tester(5, chocolateFeast(6,2,2));
    }
}
