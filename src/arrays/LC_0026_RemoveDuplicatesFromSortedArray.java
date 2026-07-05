package arrays;

/*
 * LeetCode 26 - Remove Duplicates from Sorted Array
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        if (n == 0)
            return 0;

        int k = 1;

        for (int i = 1; i < n; i++) {

            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}