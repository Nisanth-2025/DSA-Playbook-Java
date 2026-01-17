/**
 * Problem: Cells with Odd Values in a Matrix
 * LeetCode: 1252
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 *
 * Pattern: Array Traversal, Matrix , Simulation
 * Time Complexity: O(m + n + k)
 * Space Complexity: O(m + n)
 */

class Solution
{
    public int oddCells(int m, int n, int[][] indices) 
    {
        int count = 0;
        int oddRows = 0;
        int oddColumns = 0;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int x[] : indices)
        {
            row[x[0]]++;
            col[x[1]]++;
        }
        for(int i=0;i<m;i++)
        {
            if(row[i]%2!=0)
            {
                oddRows++;
            }
        }
        for(int j=0;j<n;j++)
        {
            if(col[j]%2!=0)
            {
                oddColumns++;
            }
        }
        return oddRows * n + oddColumns * m - 2*oddRows*oddColumns;
    }
}