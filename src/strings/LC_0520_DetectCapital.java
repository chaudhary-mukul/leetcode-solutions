package strings;

/*
 * LeetCode 520 - Detect Capital
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean detectCapitalUse(String word) {

        int n = word.length();

        if (n <= 1) {
            return true;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }

        // All uppercase or all lowercase
        if (count == n || count == 0) {
            return true;
        }

        // Only the first letter is uppercase
        if (count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }
}