package arrays;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 3731 - Find Missing Elements
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

class Solution {

    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);

        List<Integer> missing = new ArrayList<>();

        int k = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (nums[i] > k) {
                missing.add(k);
                k++;
            }

            k++;
        }

        return missing;
    }
}