// LeetCode Problem 26: Remove Duplicates from Sorted Array
// Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// Time Complexity: O(n)
// Space Complexity: O(1)
// This solution uses a HashSet to store the unique elements as we iterate through the array.
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
       // Find the unique elements and place them in the first and duplicate elements in 
       //the last and return the length of unique list by incrementing a variable

        // ArrayList<Integer> can also be used but Set will be faster.
        Set<Integer> check = new HashSet<>();
        int index = 0;

        for (int i=0; i<nums.length; i++)
        {
            if(!check.contains(nums[i]))
            {
                check.add(nums[i]);
                nums[index++] = nums[i]; // Store unique values at the front
            }
            

        }

        return index;

    }

    public static void Main(String args[])
    {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2};
        int result = solution.removeDuplicates(nums);
        System.out.println(result); // Output: 2
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " "); // Output: 1 2
        }
        System.out.println();
    }
}