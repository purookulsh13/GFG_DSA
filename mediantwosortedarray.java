/*
Median of 2 Sorted Arrays of Different Sizes
Difficulty: HardAccuracy: 28.4%Submissions: 112K+Points: 8
Given two sorted arrays array1 and array2 of size m and n respectively. Find the median of the two sorted arrays.

Example 1:

Input:
m = 3, n = 4
array1[] = {1,5,9}
array2[] = {2,3,6,7}
Output: 5
Explanation: The middle element for
{1,2,3,5,6,7,9} is 5
Example 2:

Input:
m = 2, n = 4
array1[] = {4,6}
array2[] = {1,2,3,5}
Output: 3.5
 */


 class GFG 
 { 
     static double medianOfArrays(int n, int m, int a[], int b[]) 
     {
         ArrayList<Integer> li = new ArrayList<>();
         for(int i : a)
             li.add(i);
         for(int j : b)
             li.add(j);
         Collections.sort(li);
         int si = li.size();
         int ind=0;
         double res=0;
         if(si%2!=0){
             ind = (si-1)/2;
             res = li.get(ind);
         }
         else{
             ind = si/2;
             res = (double) (li.get(si/2)+li.get((si/2)-1))/2.0;
         }
         return res;
     }
 }

 /*
  * Solution :  we contain both the arrays in one contaner let it be arraylist container 
                Now, we sort all the elements inside  that merge array list container
                then, we check if size of that list is odd or even for finding the median
                and, for both even and odd respectively we apply the formula to find out the median
  */