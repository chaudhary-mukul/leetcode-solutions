package arrays;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 2996 - Smallest Missing Integer Greater Than Sequential Prefix Sum
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public int missingInteger(int[] nums) {

        Set<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            numsSet.add(num);
        }

        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1] + 1) {
                break;
            }

            ans += nums[i];
        }

        while (numsSet.contains(ans)) {
            ans++;
        }

        return ans;
    }
}