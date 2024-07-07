/*
Second Largest

Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.

Examples:

Input: arr = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr = [10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist so answer is -1.
 */

import java.util.*;

public class second_largest {
    class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        Set<Integer> s = new HashSet<>(arr);
        List<Integer> st = new ArrayList<>(s);
        if(st.size()<2)
            return -1;
        Collections.sort(st, Collections.reverseOrder());
        return st.get(1);
        
    }
}
}
