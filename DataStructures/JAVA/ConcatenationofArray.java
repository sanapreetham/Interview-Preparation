// Problem Link: https://leetcode.com/problems/concatenation-of-array/
// LeetCode Problem 1929: Concatenation of Array
// Problem: Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i % n] for 0 <= i < 2n (0-indexed).
// System.arraycopy() can be used to copy elements 
class ConcatenationofArray {
    public int[] getConcatenation(int[] nums) {
        
        int n= nums.length;
        int[] ans = new int[2*n];
        for (int i=0; i<nums.length; i++)
        {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        // System.arraycopy(nums, 0, ans, 0, n); // Copy first half
        // System.arraycopy(nums, 0, ans, n, n); // Copy second half
        return ans;
    }

    public static void main(String args[])
    {
        // Create an instance of the Solution class
        ConcatenationofArray solution = new ConcatenationofArray();
        // Example input array  
        int[] nums = { 1, 2, 1 };
        // Call the getConcatenation method and store the result
        int[] result = solution.getConcatenation(nums);
        // Print the result 
        System.out.print("Concatenated Array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}