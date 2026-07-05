package strings;

/*
 * LeetCode 28 - Find the Index of the First Occurrence in a String
 *
 * Difficulty: Easy
 *
 * Time Complexity: O((n - m + 1) × m)
 * Space Complexity: O(m)
 */

class Solution {

    public int strStr(String haystack, String needle) {

        int hLen = haystack.length();
        int nLen = needle.length();

        if (nLen > hLen) {
            return -1;
        }

        // Check every possible starting position
        for (int i = 0; i <= hLen - nLen; i++) {

            String sub = haystack.substring(i, i + nLen);

            if (sub.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}