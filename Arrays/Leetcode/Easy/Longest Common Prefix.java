/**
 * Problem: Longest Common Prefix
 * LeetCode: 14
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/longest-common-prefix    /
 *
 * Pattern: Array Traversal
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 */

class Solution {
    public String longestCommonPrefix(String[] strs)
    {
        int index = 0;
        String str = strs[0];
        StringBuilder res = new StringBuilder();
        for(String s : strs)
        {
            if(s.length()<str.length())
            {
                str = s;
            }
        }
        while(index<str.length())
        {
            int count = 0;
            for(String s : strs)
            {
                if(str.charAt(index) == s.charAt(index))
                {
                    count++;
                }
                else
                { 
                    return res.toString();
                }
            }
            if(count == strs.length)
            {
                res.append(str.charAt(index));
            }
            index++;
        }
        return res.toString();
    }
}