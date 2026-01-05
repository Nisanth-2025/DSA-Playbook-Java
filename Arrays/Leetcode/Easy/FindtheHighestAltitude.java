/**
 * Problem: Find the Highest Altitude
 * LeetCode: 1732
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/find-the-highest-altitude/
 *
 * Pattern: Prefix Sum
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution 
{
    public int largestAltitude(int[] gain)
    {
        int current = 0;
        int altitude = 0;
        for(int i = 0;i<gain.length;i++)
        {
            current+=gain[i];
            altitude = Math.max(current,altitude);
        }
        return altitude;
    }
}