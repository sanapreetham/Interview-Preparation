// Problem Link: https://leetcode.com/problems/concatenation-of-array/
// LeetCode Problem 1929: Concatenation of Array
// Problem: Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i % n] for 0 <= i < 2n (0-indexed).
// Recursion can be used until the length = nums.length - if nums.length == 0 return false;
public class BuildArrayfromPermutation {
    public int[] buildArray(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];

        for (int i=0;i<n;i++)
        {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        BuildArrayfromPermutation solution = new BuildArrayfromPermutation();
        int[] nums = {0,2,1,5,3,4};
        int[] result = solution.buildArray(nums);
        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
