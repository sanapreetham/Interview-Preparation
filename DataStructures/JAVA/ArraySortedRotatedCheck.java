// Check if Array is Sorted and Rotated
// LeetCode Problem 1752: Check if Array Is Sorted and Rotated
// Problem: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
// Time Complexity: O(n)
// Space Complexity: O(1)
// This solution iterates through the array and counts the number of times the next element is less than the current element.
// If this happens more than once, the array is not sorted and rotated. Otherwise, it is.
// nums[(i+1)%nums.length] - is used to handle the circular nature of the array, where the last element wraps around to the first element.
// The modulo operator (%) is used to ensure that the index wraps around when it reaches the end of the array.

class ArraySortedRotatedCheck {
    public boolean check(int[] nums) {

        int rotationalPoint = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length] && ++rotationalPoint > 1) {
                return false;
            }

        }
        return rotationalPoint <= 1;
    }

    public static void main(String[] args) {
        ArraySortedRotatedCheck solution = new ArraySortedRotatedCheck();
        int[] nums = { 3, 4, 5, 1, 2 };
        boolean result = solution.check(nums);
        System.out.println(result); // Output: true
    }
}