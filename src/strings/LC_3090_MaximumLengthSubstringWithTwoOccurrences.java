package strings;

/*
 * LeetCode 3090 - Maximum Length Substring With Two Occurrences
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maximumLengthSubstring(String s) {

        int[] count = new int[26];
        int maxLen = 0;
        int left = 0;

        char[] chars = s.toCharArray();

        for (int right = 0; right < chars.length; right++) {

            count[chars[right] - 'a']++;

            while (count[chars[right] - 'a'] > 2) {
                count[chars[left] - 'a']--;
                left++;
            }

            int currentLen = right - left + 1;

            if (currentLen > maxLen) {
                maxLen = currentLen;
            }
        }

        return maxLen;
    }
}