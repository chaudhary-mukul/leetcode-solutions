package math;

/*
 * LeetCode 1979 - Find Greatest Common Divisor of Array
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n + log(min, max))
 * Space Complexity: O(1)
 */

class Solution {

    public int findGCD(int[] nums) {

        int min = 1001;
        int max = 0;

        for (int num : nums) {

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        return gcd(min, max);
    }

    int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}