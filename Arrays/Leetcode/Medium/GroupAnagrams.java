/**
 * Problem: Group Anagrams
 * LeetCode: 49
 * Difficulty: Medium
 * Link: https://leetcode.com/problems/group-anagrams/
 *
 * Pattern: Array Traversal, Hashing
 * Time Complexity: O(n * k log k)
 * Space Complexity: O(n*k)
 */

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<String,List<String>> res = new HashMap<>();
        for(String s : strs)
        {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!res.containsKey(key))
            {
                res.put(key,new ArrayList<>());
            }
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}