/**
 * Problem: Kids With the Greatest Number of Candies
 * LeetCode: 1431
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 *
 * Pattern: 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int max = 0;
        List<Boolean> res = new ArrayList<>();
        for(int x : candies)
        {
            max = Math.max(x,max);
        }
        for(int i=0;i<candies.length;i++)
        {
            res.add(i,candies[i]+extraCandies>=max?true:false);
        }
        return res;
    }
}