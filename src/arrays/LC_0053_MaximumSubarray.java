package arrays;

/*
 * LeetCode 53 - Maximum Subarray
 *
 * Difficulty: Medium
 *
 * Algorithm: Kadane's Algorithm
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {

            currentSum += num;

            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}