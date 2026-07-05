package math;

/*
 * LeetCode 9 - Palindrome Number
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(log10 n)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean isPalindrome(int x) {

        if (x < 0)
            return false;

        int reversed = 0;
        int original = x;

        while (original != 0) {

            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }

        return reversed == x;
    }
}