/**
 * Problem: Count Residue Prefixes
 * LeetCode: 3803
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/count-residue-prefixes/
 *
 * Pattern: Simulation
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution
{
    public int residuePrefixes(String s) 
    {
        int count = 0;
        int distinct = 0;
        boolean[] bool = new boolean[26];
        for(int i = 0;i<s.length();i++)
        {
            if(bool[s.charAt(i) - 'a'] == false)
            {
                bool[s.charAt(i) - 'a'] = true;
                distinct++;
            }
            if(distinct == (i+1)%3)
            {
                count++;
            }
        }
        return count;
    }
}