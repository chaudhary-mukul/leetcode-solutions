package strings;

/*
 * LeetCode 796 - Rotate String
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public boolean rotateString(String s, String goal) {

        return s.length() == goal.length() && (s + s).contains(goal);
    }
}