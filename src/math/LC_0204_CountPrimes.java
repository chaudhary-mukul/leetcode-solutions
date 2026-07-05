package math;

/*
 * LeetCode 204 - Count Primes
 *
 * Difficulty: Medium
 *
 * Algorithm: Sieve of Eratosthenes
 *
 * Time Complexity: O(n log log n)
 * Space Complexity: O(n)
 */

class Solution {

    public int countPrimes(int n) {

        if (n <= 2)
            return 0;

        boolean[] isPrime = new boolean[n];

        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {

            if (isPrime[i]) {

                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {

            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}