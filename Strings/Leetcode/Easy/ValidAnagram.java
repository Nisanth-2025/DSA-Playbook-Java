/**
 * Problem: Valid Anagram
 * LeetCode: 242
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-anagram/
 *
 * Pattern: Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] res = new int[26];
        for(char ch : s.toCharArray())
        {
            res[ch - 'a']++;
        }
        for(char ch : t.toCharArray())
        {
            res[ch - 'a']--;
            if(res[ch - 'a']<0)
            {
                return false;
            }
        }
        return true;
    }
}