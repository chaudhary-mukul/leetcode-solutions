package strings;

/*
 * LeetCode 151 - Reverse Words in a String
 *
 * Difficulty: Medium
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

class Solution {

    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        s = s.trim();

        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if (ch != ' ') {

                currentWord.insert(0, ch);

            } else {

                if (currentWord.length() > 0) {

                    result.append(currentWord);
                    result.append(' ');
                    currentWord.setLength(0);
                }
            }
        }

        result.append(currentWord);

        return result.toString();
    }
}