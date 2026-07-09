package strings;

/*
 * LeetCode 58 - Length of Last Word
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int lengthOfLastWord(String s) {

        s = s.trim();

        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ' ') {
                break;
            }

            count++;
        }

        return count;
    }
}