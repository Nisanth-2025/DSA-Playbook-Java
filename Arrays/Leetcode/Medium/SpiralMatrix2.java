/**
 * Problem: Spiral Matrix 2
 * LeetCode: 59
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/spiral-matrix-ii/
 *
 * Pattern: Brute Force, Logical Thinking
 * Time Complexity: O(n^2)
 * Space Complexity: O(n^2)
 */

class Solution {
    public int[][] generateMatrix(int n) 
    {
        int[][] res = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int num = 1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                res[top][i] = num;
                num++; 
            }
            top++;
            for(int j=top;j<=bottom;j++)
            {
                res[j][right] = num;
                num++;
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    res[bottom][i] = num;
                    num++;
                }
            }
            bottom--;
            if(left<=right)
            {
                for(int j=bottom;j>=top;j--)
                {
                    res[j][left] = num;
                    num++;
                }
            }
            left++;
        }
        return res;
    }
}