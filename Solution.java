/*
 * Problem : Given elements of a stack, clone the stack without using extra space.


Example 1:

Input:
N = 10
st[] = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7}
Output:
1 
 */

//{ Driver Code Starts

import java.util.*;
public class Solution {
    // Function to clone the stack
    public static Stack<Integer> cloneStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return stack;
        }
        // Hold all items in Function Call Stack until we reach end of the stack
        int top = stack.pop();
        Stack<Integer> clonedStack = cloneStack(stack);
        
        // Insert all the items held in Function Call Stack one by one from the bottom to top
        insertAtBottom(stack, top);
        insertAtBottom(clonedStack, top);
        
        return clonedStack;
    }
    
    // Recursive function to insert an item at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        // Hold all items in Function Call Stack until we reach end of the stack
        int top = stack.pop();
        insertAtBottom(stack, item);
        
        // Insert all the items held in Function Call Stack one by one from the bottom to top
        stack.push(top);
    }
    
    // Utility function to print the stack
    public static void printStack(Stack<Integer> stack) {
        for (Integer i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Original Stack:");
        printStack(stack);
        
        Stack<Integer> clonedStack = cloneStack(stack);
        
        System.out.println("Cloned Stack:");
        printStack(clonedStack);
        
        System.out.println("Original Stack after cloning:");
        printStack(stack);
    }
}
