/**
 * Problem: Valid Palindrome
 * LeetCode: 125
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-palindrome/
 *
 * Pattern: Two pointer
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution 
{
    public boolean isPalindrome(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch) || Character.isAlphabetic(ch))
            {
                sb.append(Character.toLowerCase(ch));
            }
        }
        String str = sb.toString();
        int left = 0;
        int right = str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true; 
    }
}