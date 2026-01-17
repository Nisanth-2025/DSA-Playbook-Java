/**
 * Problem: Transpose Matrix
 * LeetCode: 867
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/transpose-matrix/
 *
 * Pattern: Array Traversal, Matrix, Simulation
 * Time Complexity: O(m*n)
 * Space Complexity: O(m*n)
 */

class Solution {
    public int[][] transpose(int[][] matrix)
    {
        int row_len = matrix.length;
        int col_len = matrix[0].length;
        int[][] res = new int[col_len][row_len];
        for(int row = 0;row<row_len;row++)
        {
            for(int col = 0;col<col_len;col++)
            {
                res[col][row] = matrix[row][col];
            }
        }
        return res;
    }
}