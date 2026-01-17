/**
 * Problem: Check if the Sentence Is Pangram
 * LeetCode: 1832
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 *
 * Pattern: Array Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean checkIfPangram(String sentence)
    {
        if(sentence.length()<26)
        {
            return false;
        }
        for(char ch='a';ch<='z';ch++)
        {
            if(sentence.indexOf(ch)==-1)
            {
                return false;
            }
        }
        return true;
    }
}