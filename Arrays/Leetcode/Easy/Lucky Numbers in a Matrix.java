/**
 * Problem: Lucky Numbers in a Matrix
 * LeetCode: 1380
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 *
 * Pattern: Array Traversal
 * Time Complexity: O(n^3)
 * Space Complexity: O(m+n)
 */

class Solution 
{
    public List<Integer> luckyNumbers(int[][] matrix) 
    {
        List<Integer> row_min = new ArrayList<>();
        List<Integer> col_max = new ArrayList<>();
        for(int i = 0;i<matrix.length;i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<matrix[i].length;j++)
            {
                min = Math.min(min,matrix[i][j]);
            }
            row_min.add(min);
        }
        for(int j = 0;j<matrix[0].length;j++)
        {
            int max = Integer.MIN_VALUE;
            for(int i = 0;i<matrix.length;i++)
            {
                max = Math.max(max,matrix[i][j]);
            }
            col_max.add(max);
        }
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j = 0;j<matrix[i].length;j++)
            {
                if(row_min.contains(matrix[i][j]) && col_max.contains(matrix[i][j]))
                {
                    return List.of(matrix[i][j]);
                }
            }
        }
        return List.of();
    }
}