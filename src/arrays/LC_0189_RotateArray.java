package arrays;

/*
 * LeetCode 189 - Rotate Array
 *
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        int[] arr = new int[nums.length];

        int n = nums.length - k;

        for (int i = 0; i < nums.length; i++) {

            if (n == nums.length)
                n = 0;

            arr[i] = nums[n];
            n++;
        }

        for (int i = 0; i < arr.length; i++)
        {
            nums[i] = arr[i];
        }
    }
}