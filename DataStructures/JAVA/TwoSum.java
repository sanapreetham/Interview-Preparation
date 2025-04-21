// LeetCode Problem 1: Two Sum
// https://leetcode.com/problems/two-sum/
// Time Complexity: O(n)
// Space Complexity: O(n)
// This solution uses a HashMap to store the indices of the numbers as we iterate through the array.
// When we find a number that, when added to the current number, equals the target, we return the indices. O(1) lookup time for HashMap.
import java.util.Arrays;
import java.util.HashMap;

class Solution 
{
    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        int[] resultBruteForce = solution.TwoSumBruteForce(nums, target);
        System.out.println(Arrays.toString(resultBruteForce));   
        System.out.println(Arrays.toString(result));
    }



    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int difference;

        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];

            if (map.containsKey(difference)) 
            {
                return new int[] { i, map.get(difference) };
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {};
    }


    // Alternative solution using brute force approach
    // Time Complexity: O(n^2)

    // Space Complexity: O(1)
    public int[] TwoSumBruteForce(int[] nums, int target){
        for (int i = 0; i<nums.length; i++){
            for(int j= i + 1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}