package arrays;

/*
 * LeetCode 283 - Move Zeroes
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public void moveZeroes(int[] nums) {

        int n = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[n];
                nums[n] = nums[i];
                nums[i] = temp;

                n++;
            }
        }
    }
}