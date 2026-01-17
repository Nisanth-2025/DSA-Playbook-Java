/**
 * Problem: Plus One
 * LeetCode: 66
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/plus-one/
 *
 * Pattern: Array Traversal, Maths
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution
{
    public int[] plusOne(int[] digits) 
    {
        int len = digits.length;
        for(int i = len-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[len+1];
        res[0] = 1;
        return res;
    }
}