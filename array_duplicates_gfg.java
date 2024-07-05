/*
Given an array arr of size n which contains elements in range from 0 to n-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1]. 

Note: Try and perform all operations within the provided array. The extra (non-constant) ) space needs to be used only for the array to be returned.

Examples:

Input: arr[] = {0,3,1,2}, n = 4
Output: -1
Explanation: There is no repeating element in the array. Therefore output is -1.
Input: arr[] = {2,3,1,2,3}, n = 5
Output: 2 3 
Explanation: 2 and 3 occur more than once in the given array.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

class array_duplicates_gfg {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dupli = new HashSet<>();
        
        for(int i : arr){
            if(!set.add(i))
                dupli.add(i);
        }
        
        ArrayList<Integer> arli = new ArrayList<>(dupli);
        Collections.sort(arli);
        
        if(arli.isEmpty()){
            arli.add(-1);
        }
        
        return arli;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array : ");
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();
        
        ArrayList<Integer> result = duplicates(arr);

        System.out.println(result);
        s.close();
    }
    
}