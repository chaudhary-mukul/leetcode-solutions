package math;

/*
 * LeetCode 1518 - Water Bottles
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int numWaterBottles(int numBottles, int numExchange) {

        int total = numBottles;

        while (numBottles >= numExchange) {

            int newBottles = numBottles / numExchange;
            int remainingBottles = numBottles % numExchange;

            total += newBottles;
            numBottles = newBottles + remainingBottles;
        }

        return total;
    }
}