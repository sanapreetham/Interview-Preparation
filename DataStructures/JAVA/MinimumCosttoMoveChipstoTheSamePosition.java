// Problem: https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/
// LeetCode Problem 1217: Minimum Cost to Move Chips to The Same Position
// Problem: You have n chips, where the position of the ith chip is position[i].
// We need to change the position of all chips to the same position. In one step, we can change the position of the ith chip from position[i] to:
// Time Complexity: O(n)
// Space Complexity: O(1)
class MinimumCosttoMoveChipstoTheSamePosition {
    int cost = 0;
    int maxOccuredNumber = 0;

    public int minCostToMoveChips(int[] position) {
        //Find the number of odd numbers and number of even numbers
        //Get the minimum value
        findCost(position);
        return cost;
    }

    public int findCost(int[] position) {

        int EvenCost = 0;
        int OddCost = 0;

        //Go through array once and count even and odd numbers
        for (int i = 0; i < position.length; i++) {
            if (position[i] % 2 == 0) {
                EvenCost = EvenCost + 1;
            } else {
                OddCost = OddCost + 1;
            }
        }
        //If even numbers are more than odd numbers then cost = odd numbers
        //Else cost = even numbers
        if (EvenCost > OddCost) {
            cost = OddCost;
        } else {
            cost = EvenCost;
        }        
        return cost;
    }

    public static void main(String[] args) {
        MinimumCosttoMoveChipstoTheSamePosition solution = new MinimumCosttoMoveChipstoTheSamePosition();
        int[] position = {2,2,2,3,3};
        int result = solution.minCostToMoveChips(position);
        System.out.println(result);
    }
}