package arrays;

/*
 * LeetCode 1929 - Concatenation of Array
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public int[] getConcatenation(int[] nums) {

        int k = nums.length;
        int[] ans = new int[2 * k];

        k = 0;

        for (int i = 0; i < ans.length; i++) {

            if (i == nums.length) {
                k = 0;
            }

            ans[i] = nums[k];
            k++;
        }

        return ans;
    }
}