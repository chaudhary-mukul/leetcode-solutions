package strings;

/*
 * LeetCode 1446 - Consecutive Characters
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maxPower(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLen++;
            } else {
                currentLen = 1;
            }

            maxLen = Math.max(maxLen, currentLen);
        }

        return maxLen;
    }
}