/**
 * Problem: Minimum Cost to Move Chips to The Same Position
 * LeetCode: 1217
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
 *
 * Pattern: Array Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution 
{
    public int minCostToMoveChips(int[] position) 
    {
        int odd = 0;
        int even = 0;
        for(int i=0;i<position.length;i++)
        {
            if(position[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}