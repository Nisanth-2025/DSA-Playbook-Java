/**
 * Problem: Count Items Matching a Rule
 * LeetCode: 1773
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/count-items-matching-a-rule/
 *
 * Pattern: Array Traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution 
{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue)
    {
        int total = 0;
        int col_index = ruleKey.equals("type")?0:ruleKey.equals("color")?1:2;
        for(int i =0;i<items.size();i++)
        {
            if((items.get(i).get(col_index)).equals(ruleValue))
            {
                total++;
            }
        }
        return total;
    }
}