/*
 * Best Time to Buy and Sell Stock
 *
 * Problem Statement:
 * You are given an array prices where prices[i] is the price of a given
 * stock on the i-th day.
 *
 * You want to maximize your profit by choosing a single day to buy one
 * stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 *
 * Example:
 * prices = [7, 1, 5, 3, 6, 4]
 *
 * Price Trend:
 *
 * Price
 *   7 | ●
 *   6 |                 ●
 *   5 |         ●
 *   4 |                     ●
 *   3 |             ●
 *   2 |
 *   1 |     ●
 *     +---------------------------->
 *       D1 D2 D3 D4 D5 D6
 *
 * Buy  -> Day 2 (Price = 1)
 * Sell -> Day 5 (Price = 6)
 *
 * Maximum Profit = 6 - 1 = 5
 */

import java.util.*;
public class BuyAndSellStocks {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]) { // Profit
                int profit = prices[i] - buyPrice;  // Today's profit
                maxProfit = Math.max(maxProfit, profit);
            }else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println("Maximum profit is " + buyAndSellStocks(prices));
    }
}