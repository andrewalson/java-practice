package leetcode.easy;//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.

public class TwoSum {

    public int[] getSum(int[] nums, int target) {

        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int savedIndex = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                int toAdd = nums[j];

                if (savedIndex + toAdd == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
