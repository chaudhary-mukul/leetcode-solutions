package math;

/*
 * LeetCode 3345 - Smallest Divisible Digit Product I
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public int smallestNumber(int n, int t) {

        for (int num = n; num < n + 10; num++) {

            if (getDigitProd(num) % t == 0) {
                return num;
            }
        }

        return -1;
    }

    private int getDigitProd(int num) {

        int product = 1;

        while (num > 0) {
            product *= num % 10;
            num /= 10;
        }

        return product;
    }
}