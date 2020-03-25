package com.leetcode.twoThreeHundred;

/**
 * Created by LiuLiHao on 2020/3/25 0025 上午 09:12
 * @author : LiuLiHao
 * 描述：
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，
 * 找出该数组中满足其和 ≥ s 的长度最小的连续子数组。
 * 如果不存在符合条件的连续子数组，返回 0。
 *
 * 示例: 
 *
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 *
 */
public class MinimumSizeSubarray209 {
    public static void main(String[] args) {

        int[] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, nums));
    }

    public static int minSubArrayLen(int s, int[] nums) {
        int result = nums.length + 1;
        int left = 0, right = -1;
        int sum = 0;
        while (left < nums.length) {
            if (right + 1 < nums.length && sum < s) {
                sum += nums[++right];
            } else {
                sum -= nums[left++];
            }
            if (sum >= s) {
                result = Math.min(result, right - left + 1);
            }
        }
        if (result == nums.length + 1) {
            return 0;
        }

        return result;
    }
}
