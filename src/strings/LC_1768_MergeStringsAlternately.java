package strings;

/*
 * LeetCode 1768 - Merge Strings Alternately
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */

class Solution {

    public String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();

        int i = 0, j = 0;
        int len1 = word1.length();
        int len2 = word2.length();

        while (i < len1 && j < len2) {

            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        result.append(word1.substring(i));
        result.append(word2.substring(j));

        return result.toString();
    }
}