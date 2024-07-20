/*
 * Count pairs with given sum
 * 
Given an array arr, and an integer k, find the number of pairs of elements in the array whose sum is k.

Examples:

Input: k = 6, arr[] = [1, 5, 7, 1]
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.
Input: k = 2, arr[] = [1, 1, 1, 1]
Output: 6
Explanation: Each 1 will produce sum 2 with any 1.
Input: k = 2, arr[] = [4, 12, 5, 4]
Output: 0
Explanation: There are 0 pairs with sum 2.
 */

import java.util.HashMap;
import java.util.Map;

public class countpairswithgivensum {
    int getPairsCount(int[] arr, int sum) {
        // code here
       Map<Integer, Integer> mp = new HashMap<>();
        int cnt = 0;
        
        for (int i : arr) {
            int com = sum - i;
            if (mp.containsKey(com)) {
                cnt += mp.get(com);
            }
            
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        
        return cnt;
    }
}
