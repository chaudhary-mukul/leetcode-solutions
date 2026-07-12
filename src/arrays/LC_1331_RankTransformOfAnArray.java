package arrays;

import java.util.Arrays;
import java.util.HashMap;

/*
 * LeetCode 1331 - Rank Transform of an Array
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

class Solution {

    public int[] arrayRankTransform(int[] arr) {

        int[] copy = arr.clone();
        Arrays.sort(copy);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int num : copy) {

            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}