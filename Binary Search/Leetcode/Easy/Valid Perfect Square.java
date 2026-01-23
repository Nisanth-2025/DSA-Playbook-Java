/**
 * Problem: Valid Perfect Square
 * LeetCode: 367
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-perfect-square/
 *
 * Pattern: Divide & Conquer
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution 
{
    public boolean isPerfectSquare(int num) 
    {
        if(num==1)
        {
            return true;
        }
        int left = 1;
        int right = num/2;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(mid*mid == num)
            {
                return true;
            }
            if((long)mid*mid > (long)num)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        return false;    
    }
}