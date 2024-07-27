/*
 * Problem : Given an array arr[] of positive integers of size N. The task is to count pairs of adjacent elements which are consecutive. 
 * A pair is said to be consecutive if the second element in the pair is greater than the first element by 1. 

Example 1:

Input: N = 5
arr = {5, 7, 6, 7, 4}
Output: 1
Explaination: (6, 7) pair is the only such pair.
Example 2:

Input: N = 4
arr = {1, 2, 3, 4}
Output: 3
Explaination: (1, 2), (2, 3), (3, 4) are the 
pairs.
 */

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.adjacentPairs(N, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int adjacentPairs(int N, int arr[]){
        // code here
        int cp=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1==arr[i+1])
                ++cp;
        }
        return cp;
    }
}