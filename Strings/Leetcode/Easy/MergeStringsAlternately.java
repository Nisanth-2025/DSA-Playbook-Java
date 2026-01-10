/**
 * Problem: Merge Strings Alternately
 * LeetCode: 1768
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/merge-strings-alternately/
 *
 * Pattern: Two pointers
 * Time Complexity: O(n+m)
 * Space Complexity: O(n+m)
 */

class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder sb = new StringBuilder();
        int left=0;
        int len1 = word1.length();
        int len2 = word2.length();
        while(left<len1 || left<len2)
        {
            if(left<len1)
            {
                sb.append(word1.charAt(left));
            }
            if(left<len2)
            {
                sb.append(word2.charAt(left));
            }
            left++;
        }
        return sb.toString();    
    }
}