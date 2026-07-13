package math;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1291 - Sequential Digits
 *
 * Difficulty: Medium
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * (At most 36 sequential-digit numbers are generated.)
 */

class Solution {

    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> result = new ArrayList<>();
        String sample = "123456789";

        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        for (int len = lowLen; len <= highLen; len++) {

            for (int start = 0; start + len <= 9; start++) {

                String sub = sample.substring(start, start + len);
                int value = Integer.parseInt(sub);

                if (value >= low && value <= high) {
                    result.add(value);
                }
            }
        }

        return result;
    }
}