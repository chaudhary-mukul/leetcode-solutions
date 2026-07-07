package math;

/*
 * LeetCode 3754 - Concatenate Non-Zero Digits and Multiply by Sum
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 *
 * where d is the number of digits.
 */

class Solution {

    public long sumAndMultiply(int n) {

        long sum = 0;
        long reversedNumber = 0;

        while (n != 0) {

            int digit = n % 10;

            if (digit != 0) {
                reversedNumber = reversedNumber * 10 + digit;
                sum += digit;
            }

            n /= 10;
        }

        long number = 0;

        while (reversedNumber != 0) {

            long digit = reversedNumber % 10;
            number = number * 10 + digit;
            reversedNumber /= 10;
        }

        return number * sum;
    }
}