package strings;

/*
 * LeetCode 125 - Valid Palindrome
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

class Solution {

    public boolean isPalindrome(String s) {

        String st = "", st2 = "";

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {

            char k = s.charAt(i);

            if (k >= 'a' && k <= 'z' || k >= '0' && k <= '9') {

                st = st + k;
                st2 = k + st2;
            }
        }

        if (st.equals(st2)) {
            return true;
        }

        return false;
    }
}