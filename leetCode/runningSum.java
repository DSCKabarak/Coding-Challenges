/**
 * ## 💻 Running Sum of 1d Array
 * Leetcode daily study practice, you can find it
 * [here](https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1)
 * 
 * ### 📖 Challenge
 * Given an array nums. We define a running sum of an array as `runningSum[i] =
 * sum(nums[0]…nums[i])`.
 * 
 * Return the running sum of nums.
 * 
 * Example 1:
 * 
 * ```
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * ```
 */

class Solution {
    public int[] runningSum(int[] nums) {
        /** Array to hold result of Running Sum */
        int[] res = {};

        /**
         * Iterated over the array adding the number in the current index with the next
         * number and adding the sum into the [res] array
         */
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] + nums[++i];
        }

        return res;
    }
}

/**
 * Responsible for testing and running the solution
 * Has two methods, [main] - runs the result and [getInput] - gets Input from
 * user
 */
class Main {
    public static void main(String[] args) {
        // Reading Outputs
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // Getting Solutions
        Solution sln = new Solution();
        int[] r = sln.runningSum(input);

        // Printing Results
        System.out.println(r);
    }
}