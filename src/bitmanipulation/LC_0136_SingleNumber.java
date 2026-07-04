package bitmanipulation;
/*
 * LeetCode 136 - Single Number
 *
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class LC_0136_SingleNumber
{
    public int singleNumber(int[] nums)
    {

        int ans = 0;

        for (int num : nums)
        {
            ans ^= num;
        }
        return ans;
    }
}
