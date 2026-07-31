package strings;

import java.util.Arrays;

/*
 * LeetCode 3016 - Minimum Number of Pushes to Type Word II
 *
 * Difficulty: Medium
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int minimumPushes(String word) {

        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }

        Arrays.sort(count);

        int totalPushes = 0;
        int multiplier = 1;
        int keysUsed = 0;

        for (int i = 25; i >= 0; i--) {

            if (count[i] == 0) {
                break;
            }

            totalPushes += count[i] * multiplier;
            keysUsed++;

            if (keysUsed % 8 == 0) {
                multiplier++;
            }
        }

        return totalPushes;
    }
}