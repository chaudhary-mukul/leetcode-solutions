package strings;

/*
 * LeetCode 387 - First Unique Character in a String
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int firstUniqChar(String s) {

        int[] count = new int[26];
        int n = s.length();

        // Count frequencies of each character
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Find the first character with a frequency of 1
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}