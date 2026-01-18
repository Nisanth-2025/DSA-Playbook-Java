/**
 * Problem: Reshape the Matrix
 * LeetCode: 566
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/reshape-the-matrix/
 *
 * Pattern: Matrix, Simulation
 * Time Complexity: O(m*n)
 * Space Complexity: O(m*n)
 */
class Solution 
{
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        int len = mat.length*mat[0].length;
        int new_len = r*c;
        if(len != new_len)
        {
            return mat;
        }
        int[] temp = new int[r*c];
        int k =0;
        for(int i = 0;i<mat.length;i++)
        {
            for(int j =0;j<mat[i].length;j++)
            {
                temp[k] = mat[i][j];
                k++;
            }
        }
        k=0;
        int[][] res = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                res[i][j] = temp[k];
                k++;
            }
        }
        return res;  
    }
}