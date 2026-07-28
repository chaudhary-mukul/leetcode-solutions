package strings;

/*
 * LeetCode 3517 - Smallest Palindromic Rearrangement I
 *
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public String smallestPalindrome(String s) {

        int n = s.length();
        int[] count = new int[26];

        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }

        StringBuilder leftHalf = new StringBuilder();
        char midChar = 0;

        for (int i = 0; i < 26; i++) {

            if (count[i] > 0) {

                if (count[i] % 2 != 0) {
                    midChar = (char) (i + 'a');
                }

                for (int j = 0; j < count[i] / 2; j++) {
                    leftHalf.append((char) (i + 'a'));
                }
            }
        }

        StringBuilder rightHalf = new StringBuilder(leftHalf).reverse();

        if (n % 2 != 0) {
            return leftHalf.toString() + midChar + rightHalf.toString();
        }

        return leftHalf.toString() + rightHalf.toString();
    }
}