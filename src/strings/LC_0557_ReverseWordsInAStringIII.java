package strings;

/*
 * LeetCode 557 - Reverse Words in a String III
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public String reverseWords(String s) {

        char[] chars = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= chars.length; end++) {

            if (end == chars.length || chars[end] == ' ') {

                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }

        return new String(chars);
    }

    void reverse(char[] chars, int left, int right) {

        while (left < right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
    }
}