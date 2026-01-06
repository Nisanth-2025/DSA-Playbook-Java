/**
 * Problem: Matrix Diagonal Sum
 * LeetCode: 1572
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/matrix-diagonal-sum/
 *
 * Pattern: Array Traversal, Matrix
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int diagonalSum(int[][] mat)
    {
        int sum = 0;
        int len = mat.length;
        int j = len-1;
        for(int i =0;i<len;i++)
        {
            sum += mat[i][i]; 
            sum += mat[i][j];
            if(i == j)
            {
                sum -= mat[i][j];
            }
            j--;
        }
        return sum; 
    }
}