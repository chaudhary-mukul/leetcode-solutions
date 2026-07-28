package arrays;

/*
 * LeetCode 2798 - Number of Employees Who Met the Target
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int count = 0;

        for (int h : hours) {
            if (h >= target) {
                count++;
            }
        }

        return count;
    }
}