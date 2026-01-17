/**
 * Problem: Longest Palindromic Substring
 * LeetCode: 5
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/longest-palindromic-substring/
 *
 * Pattern: Two Pointers
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Solution {
    public String longestPalindrome(String s)
    {
        int len = s.length();
        String str = "";
        for(int i=0;i<len;i++)
        {
            String a = calcPalindrome(s,i,i,len);
            String b = calcPalindrome(s,i,i+1,len);
            String temp = (a.length()>=b.length()?a:b);
            str = (temp.length()>=str.length())?temp:str;
        }
        return str;
    }
    public String calcPalindrome(String s,int l,int r,int n)
    {
        while(l>=0 && r<n && s.charAt(l) == s.charAt(r))
        {
                l--;
                r++;
        }
        return s.substring(l+1,r);
    }
}