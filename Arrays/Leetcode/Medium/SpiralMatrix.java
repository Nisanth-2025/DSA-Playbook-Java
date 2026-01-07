/**
 * Problem: Spiral Matrix
 * LeetCode: 54
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/spiral-matrix/
 *
 * Pattern: Brute Force, Logical Thinking
 * Time Complexity: O(m*n)
 * Space Complexity: O(m*n)
 */

class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        List<Integer> res = new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            for(int i = left;i<=right;i++)
            {
                res.add(matrix[top][i]);
            }
            top++;

            for(int j = top;j<=bottom;j++)
            {
               res.add(matrix[j][right]);
            }
            right--;

            if(top<=bottom)
            {
                for(int k = right;k>=left;k--)
                {
                    res.add(matrix[bottom][k]);
                }
                bottom--;
            }
            
            if(left<=right)
            {
                for(int l = bottom;l>=top;l--)
                {
                    res.add(matrix[l][left]);
                }
                left++;
            }
            
        }
        return res;
    }
}