/**
 * Problem: Set Matrix Zeroes
 * LeetCode: 73
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/set-matrix-zeroes/
 *
 * Pattern: Array Traversal, Hashing
 * Time Complexity: O(m*n)
 * Space Complexity: O(m+n)
 */

class Solution 
{
    public void row_zero(int[][] matrix,int row)
    {
        for(int col=0;col<matrix[row].length;col++)
        {
            matrix[row][col] = 0;
        }
    }
    public void col_zero(int[][] matrix,int col)
    {
        for(int row=0;row<matrix.length;row++)
        {
            matrix[row][col] = 0;
        }
    }
    public void setZeroes(int[][] matrix) 
    {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        for(int row=0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix[row].length;col++)
            {
                if(matrix[row][col] == 0)
                {
                    rows.add(row);
                    cols.add(col);
                }
            }
        }
        for(int i : rows)
        {
            row_zero(matrix,i);
        }
        for(int j : cols)
        {
            col_zero(matrix,j);
        }
    }
}