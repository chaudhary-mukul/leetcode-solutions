package math;

/*
 * LeetCode 2011 - Final Value of Variable After Performing Operations
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int finalValueAfterOperations(String[] operations) {

        int x = 0;

        for (String op : operations) {

            if (op.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }
}