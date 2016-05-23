package me.wslong.algo.leetcode;

/*

 Given an array of integers, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2

 */
public class LC0001 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int target = 6;

        LC0001 lc = new LC0001();
        long t1 = System.currentTimeMillis();
        int[] results = lc.twoSum(nums, target);
        long t2 = System.currentTimeMillis();

        System.out.println("index1=" + results[0] + ", index2=" + results[1]);
        System.out.println("execution duration = " + (t2 - t1));
    }

    public int[] twoSum(int[] nums, int target) {
        int index1 = 0, index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            index1 = i;
            int s = 0;
            for (int j = i + 1; j < nums.length; j++) {
                index2 = j;
                if (nums[i] + nums[j] == target) {
                    s = 1;
                    break;
                }
            }
            if (s == 1)
                break;
        }
        return new int[] { (index1 + 1), (index2 + 1) };
    }
}
