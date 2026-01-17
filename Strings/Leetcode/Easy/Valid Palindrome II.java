/**
 * Problem: Valid Palindrome II
 * LeetCode: 680
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-palindrome-ii/
 *
 * Pattern: Two Pointers
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean validpalindrome2(String s,int left,int right)
    {
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s) 
    {
        int left = 0;
        int right = s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return validpalindrome2(s,left,right-1)||validpalindrome2(s,left+1,right);
            }
            left++;
            right--;
        }
        return true;
    }
}