/*
You are given an array arr. You need to print elements of arr in alternate order (starting from index 0).
Examples:

Input: arr[] = [1, 2, 3, 4]
Output: 1 3
Input: arr[] = [1, 2, 3, 4, 5]
Output: 1 3 5
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraints:
1 <=  arr.size <= 105
1 <= arr[i] <= 105
 */

class Solution {
    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
                System.out.print(arr[i]+" ");
        }
    }
}