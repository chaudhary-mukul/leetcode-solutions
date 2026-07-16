package arrays;

/*
 * LeetCode 485 - Max Consecutive Ones
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {

            if (num == 1) {
                currentCount++;
            } else {

                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }

                currentCount = 0;
            }
        }

        return Math.max(maxCount, currentCount);
    }
}