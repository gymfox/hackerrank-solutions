package com.gymfox.halloween_sale;

public class Solution {
    static int howManyGames(int price, int diff, int minimalCost, int moneyCount) {
        int gamesCount = 0;

        while (moneyCount - price >= 0) {
            if ( price <= minimalCost ) {
                moneyCount -= minimalCost;
                price = minimalCost;
            } else {
                moneyCount -= price;
                price -= diff;
            }

            gamesCount += 1;
            if ( moneyCount < minimalCost ) {
                return gamesCount;
            }
        }

        return gamesCount;
    }
}
