package arrays;

public class LC_0152_MaximumProductSubarray package arrays;

/*
 * LeetCode 152 - Maximum Product Subarray
 *
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maxProduct(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];

            int tempMax = Math.max(current,
                    Math.max(max * current, min * current));

            int tempMin = Math.min(current,
                    Math.min(max * current, min * current));

            max = tempMax;
            min = tempMin;

            answer = Math.max(answer, max);
        }

        return answer;
    }
}{
}
